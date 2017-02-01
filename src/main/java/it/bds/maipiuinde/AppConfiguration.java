package it.bds.maipiuinde;

import it.bds.maipiuinde.entities.Struttura;
import it.bds.maipiuinde.entities.Utente;
import it.bds.maipiuinde.repositories.StrutturaRepository;
import it.bds.maipiuinde.repositories.UtenteRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class AppConfiguration extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Utente.class);

        config.exposeIdsFor(Struttura.class);
        // RepositoryRestConfiguration entityLookups = config.getEntityLookups(UtenteRepository);
    }
}
