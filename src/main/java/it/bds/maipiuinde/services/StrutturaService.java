package it.bds.maipiuinde.services;

import it.bds.maipiuinde.entities.Struttura;
import it.bds.maipiuinde.repositories.StrutturaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrutturaService {

    @Autowired
    private StrutturaRepository strutturaRepository;

    public Integer insertStruttura(Struttura struttura) {

        return strutturaRepository.save(struttura).getIdStruttura();
    }

    public void deleteStruttura(Integer idStruttura) {

        strutturaRepository.delete(idStruttura);
    }

    public void deleteAll() {

        strutturaRepository.deleteAll();
    }

    public List<Struttura> findStruttura(String name) {
        return strutturaRepository.findByNomeStruttura(name);
    }

}
