/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author inftel07
 */
@Entity
@Table(name = "JUGADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j")
    , @NamedQuery(name = "Jugador.findByIdPersona", query = "SELECT j FROM Jugador j WHERE j.idPersona = :idPersona")
    , @NamedQuery(name = "Jugador.findByAltura", query = "SELECT j FROM Jugador j WHERE j.altura = :altura")
    , @NamedQuery(name = "Jugador.findByPeso", query = "SELECT j FROM Jugador j WHERE j.peso = :peso")
    , @NamedQuery(name = "Jugador.findByDorsal", query = "SELECT j FROM Jugador j WHERE j.dorsal = :dorsal")})
public class Jugador implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private BigDecimal idPersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALTURA")
    private BigInteger altura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESO")
    private BigInteger peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DORSAL")
    private BigInteger dorsal;
    @JoinColumn(name = "EQUIPO_ID_EQUIPO", referencedColumnName = "ID_EQUIPO")
    @ManyToOne(optional = false)
    private Equipo equipoIdEquipo;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "jugador")
    private Collection<JugadorPartido> jugadorPartidoCollection;

    public Jugador() {
    }

    public Jugador(BigDecimal idPersona) {
        this.idPersona = idPersona;
    }

    public Jugador(BigDecimal idPersona, BigInteger altura, BigInteger peso, BigInteger dorsal) {
        this.idPersona = idPersona;
        this.altura = altura;
        this.peso = peso;
        this.dorsal = dorsal;
    }

    public BigDecimal getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(BigDecimal idPersona) {
        this.idPersona = idPersona;
    }

    public BigInteger getAltura() {
        return altura;
    }

    public void setAltura(BigInteger altura) {
        this.altura = altura;
    }

    public BigInteger getPeso() {
        return peso;
    }

    public void setPeso(BigInteger peso) {
        this.peso = peso;
    }

    public BigInteger getDorsal() {
        return dorsal;
    }

    public void setDorsal(BigInteger dorsal) {
        this.dorsal = dorsal;
    }

    public Equipo getEquipoIdEquipo() {
        return equipoIdEquipo;
    }

    public void setEquipoIdEquipo(Equipo equipoIdEquipo) {
        this.equipoIdEquipo = equipoIdEquipo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @XmlTransient
    public Collection<JugadorPartido> getJugadorPartidoCollection() {
        return jugadorPartidoCollection;
    }

    public void setJugadorPartidoCollection(Collection<JugadorPartido> jugadorPartidoCollection) {
        this.jugadorPartidoCollection = jugadorPartidoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baloncestoliga.model.Jugador[ idPersona=" + idPersona + " ]";
    }
    
   
    
}
