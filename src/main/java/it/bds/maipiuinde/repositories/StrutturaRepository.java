package it.bds.maipiuinde.repositories;

import it.bds.maipiuinde.entities.Struttura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface StrutturaRepository extends JpaRepository<Struttura, Integer> {

    List<Struttura> findByNomeStrutturaStartsWith(@Param("nomeStruttura") String nomeStruttura);

    List<Struttura> findByNomeStruttura(@Param("nomeStruttura") String nomeStruttura);

}
