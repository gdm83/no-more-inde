package it.bds.maipiuinde.repositories;

import it.bds.maipiuinde.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, String> {

}
