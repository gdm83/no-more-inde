/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.bds.maipiuinde.entities;

import org.springframework.util.StringUtils;

public class UtenteBuilder {

    private String idUtente;
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int attivo;
    private Struttura struttura;

    public UtenteBuilder() {
    }

    public UtenteBuilder setIdUtente(String idUtente) {
        this.idUtente = idUtente;
        return this;
    }

    public UtenteBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public UtenteBuilder setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }

    public UtenteBuilder setCodiceFiscale(String codiceFiscale) {

        if (StringUtils.hasText(codiceFiscale)) {
            this.codiceFiscale = codiceFiscale.toUpperCase();
        } else {
            this.codiceFiscale = codiceFiscale;
        }

        return this;
    }

    public UtenteBuilder setAttivo(int attivo) {
        this.attivo = attivo;
        return this;
    }

    public UtenteBuilder setStruttura(Struttura struttura) {
        this.struttura = struttura;
        return this;
    }

    public Utente createUtente() {
        return new Utente(idUtente, nome, cognome, codiceFiscale, attivo, struttura);
    }

}
