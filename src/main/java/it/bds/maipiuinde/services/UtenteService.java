package it.bds.maipiuinde.services;

import it.bds.maipiuinde.entities.Utente;
import it.bds.maipiuinde.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {

    @Autowired
    private UtenteRepository utenteRepository;

    public String insertUtente(Utente utente) {

        return utenteRepository.save(utente).getIdUtente();
    }

    public void deleteUtente(String idUtente) {

        utenteRepository.delete(idUtente);
    }

    public void deleteAll() {

        utenteRepository.deleteAll();
    }

}
