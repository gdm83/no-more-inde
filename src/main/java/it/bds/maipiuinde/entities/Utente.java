/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.bds.maipiuinde.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.util.StringUtils;

/**
 *
 * @author user
 */
@Entity
@Table(name = "utenti", schema = "mai_piu_inde")
@XmlRootElement

public class Utente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "id_utente")
    private String idUtente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 52)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 52)
    @Column(name = "cognome")
    private String cognome;
    @Size(max = 16)
    @Column(name = "codice_fiscale")
    private String codiceFiscale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "attivo")
    private int attivo;
    @JoinColumn(name = "id_struttura", referencedColumnName = "id_struttura")
    @ManyToOne(optional = false)
    private Struttura struttura;

    public Utente() {
    }

    public Utente(String idUtente) {
        this.idUtente = idUtente;
    }

    public Utente(String idUtente, String nome, String cognome, int attivo) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.attivo = attivo;
    }

    public Utente(String idUtente, String nome, String cognome, String codiceFiscale, int attivo, Struttura idStruttura) {
        this.idUtente = idUtente;
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
        this.attivo = attivo;
        this.struttura = idStruttura;
    }

    public String getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(String idUtente) {
        this.idUtente = idUtente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {

        this.codiceFiscale = codiceFiscale;

    }

    public int getAttivo() {
        return attivo;
    }

    public void setAttivo(int attivo) {
        this.attivo = attivo;
    }

    public Struttura getStruttura() {
        return struttura;
    }

    public void setStruttura(Struttura struttura) {
        this.struttura = struttura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUtente != null ? idUtente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utente)) {
            return false;
        }
        Utente other = (Utente) object;
        if ((this.idUtente == null && other.idUtente != null) || (this.idUtente != null && !this.idUtente.equals(other.idUtente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.bds.maipiuinde.entities.Utenti[ idUtente=" + idUtente + " ]";
    }

}
