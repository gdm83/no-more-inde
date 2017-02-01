/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.bds.maipiuinde.entities;


public class StrutturaBuilder {

    private Integer idStruttura;
    private String nomeStruttura;
    private int attiva;

    public StrutturaBuilder() {
    }

    public StrutturaBuilder setIdStruttura(Integer idStruttura) {
        this.idStruttura = idStruttura;
        return this;
    }

    public StrutturaBuilder setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
        return this;
    }

    public StrutturaBuilder setAttiva(int attiva) {
        this.attiva = attiva;
        return this;
    }

    public Struttura createStruttura() {
        return new Struttura(idStruttura, nomeStruttura, attiva);
    }

}
