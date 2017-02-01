package it.bds.maipiuinde;

import it.bds.maipiuinde.entities.Struttura;
import it.bds.maipiuinde.entities.StrutturaBuilder;
import it.bds.maipiuinde.entities.Utente;
import it.bds.maipiuinde.entities.UtenteBuilder;
import it.bds.maipiuinde.services.StrutturaService;
import it.bds.maipiuinde.services.UtenteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class MaiPiuIndeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaiPiuIndeApplication.class, args);
    }

    @Bean
    @Transactional(rollbackFor = {Throwable.class})
    public CommandLineRunner demo(StrutturaService strutturaService, UtenteService utenteService) {
        return (args) -> {
            strutturaService.deleteAll();

            Struttura struttura1 = new StrutturaBuilder()
                    .setNomeStruttura("Manicomio")
                    .setAttiva(1)
                    .createStruttura();

            Struttura struttura2 = new StrutturaBuilder()
                    .setNomeStruttura("Struttura Bella")
                    .setAttiva(1)
                    .createStruttura();

            Utente utente1 = new UtenteBuilder()
                    .setIdUtente("g.demarco")
                    .setNome("Giuseppe")
                    .setCognome("De Marco")
                    .setCodiceFiscale("dmrgpp83e29d851c")
                    .setStruttura(struttura2)
                    .setAttivo(1)
                    .createUtente();

            Utente utente2 = new UtenteBuilder()
                    .setIdUtente("pasquini2")
                    .setNome("Andrea")
                    .setCognome("Pasquini")
                    .setStruttura(struttura1)
                    .setAttivo(1)
                    .createUtente();

            strutturaService.insertStruttura(struttura1);
            strutturaService.insertStruttura(struttura2);
            utenteService.insertUtente(utente1);
            utenteService.insertUtente(utente2);

            List<Struttura> findStruttura = strutturaService.findStruttura("Manicomio");
            System.out.println("CAZZOOOOO" + findStruttura.get(0));
        };

    }
}
