/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.bds.maipiuinde.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "strutture", schema = "mai_piu_inde")
@XmlRootElement

public class Struttura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_struttura")
    private Integer idStruttura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "nome_struttura")
    private String nomeStruttura;
    @Column(name = "data_attivazione")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAttivazione;
    @Column(name = "data_cessazione")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCessazione;
    @Basic(optional = false)
    @NotNull
    @Column(name = "attiva")
    private int attiva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "struttura")
    private List<Utente> utentiList;
    @OneToMany(mappedBy = "idStrutturaPadre")
    private List<Struttura> struttureList;
    @JoinColumn(name = "id_struttura_padre", referencedColumnName = "id_struttura")
    @ManyToOne
    private Struttura idStrutturaPadre;

    public Struttura() {
    }

    public Struttura(Integer idStruttura) {
        this.idStruttura = idStruttura;
    }

    public Struttura(Integer idStruttura, String nomeStruttura, int attiva) {
        this.idStruttura = idStruttura;
        this.nomeStruttura = nomeStruttura;
        this.attiva = attiva;
    }

    public Integer getIdStruttura() {
        return idStruttura;
    }

    public void setIdStruttura(Integer idStruttura) {
        this.idStruttura = idStruttura;
    }

    public String getNomeStruttura() {
        return nomeStruttura;
    }

    public void setNomeStruttura(String nomeStruttura) {
        this.nomeStruttura = nomeStruttura;
    }

    public Date getDataAttivazione() {
        return dataAttivazione;
    }

    public void setDataAttivazione(Date dataAttivazione) {
        this.dataAttivazione = dataAttivazione;
    }

    public Date getDataCessazione() {
        return dataCessazione;
    }

    public void setDataCessazione(Date dataCessazione) {
        this.dataCessazione = dataCessazione;
    }

    public int getAttiva() {
        return attiva;
    }

    public void setAttiva(int attiva) {
        this.attiva = attiva;
    }

    @XmlTransient
    public List<Utente> getUtentiList() {
        return utentiList;
    }

    public void setUtentiList(List<Utente> utentiList) {
        this.utentiList = utentiList;
    }

    @XmlTransient
    public List<Struttura> getStruttureList() {
        return struttureList;
    }

    public void setStruttureList(List<Struttura> struttureList) {
        this.struttureList = struttureList;
    }

    public Struttura getIdStrutturaPadre() {
        return idStrutturaPadre;
    }

    public void setIdStrutturaPadre(Struttura idStrutturaPadre) {
        this.idStrutturaPadre = idStrutturaPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStruttura != null ? idStruttura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Struttura)) {
            return false;
        }
        Struttura other = (Struttura) object;
        if ((this.idStruttura == null && other.idStruttura != null) || (this.idStruttura != null && !this.idStruttura.equals(other.idStruttura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.bds.maipiuinde.entities.Strutture[ idStruttura=" + idStruttura + " ]";
    }

}
