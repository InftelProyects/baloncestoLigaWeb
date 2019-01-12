/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author inftel07
 */
@Entity
@Table(name = "EQUIPO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByIdEquipo", query = "SELECT e FROM Equipo e WHERE e.idEquipo = :idEquipo")
    , @NamedQuery(name = "Equipo.findByNombre", query = "SELECT e FROM Equipo e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Equipo.findByProvincia", query = "SELECT e FROM Equipo e WHERE e.provincia = :provincia")
    , @NamedQuery(name = "Equipo.findByCategoria", query = "SELECT e FROM Equipo e WHERE e.categoria = :categoria")})
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq1")
    @SequenceGenerator(name="seq1",sequenceName="EQUIPO_SEQ1",initialValue = 3, allocationSize = 1)
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EQUIPO")
    private BigDecimal idEquipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 40)
    @Column(name = "PROVINCIA")
    private String provincia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CATEGORIA")
    private String categoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipoIdEquipo")
    private Collection<Jugador> jugadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipoIdEquipo")
    private Collection<Entrenador> entrenadorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipoIdEquipo")
    private Collection<Partido> partidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipoIdEquipo1")
    private Collection<Partido> partidoCollection1;

    public Equipo() {
    }
    
    

    public Equipo(BigDecimal idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipo(BigDecimal idEquipo, String nombre, String categoria) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
     public Equipo( String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public BigDecimal getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(BigDecimal idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public Collection<Jugador> getJugadorCollection() {
        return jugadorCollection;
    }

    public void setJugadorCollection(Collection<Jugador> jugadorCollection) {
        this.jugadorCollection = jugadorCollection;
    }

    @XmlTransient
    public Collection<Entrenador> getEntrenadorCollection() {
        return entrenadorCollection;
    }

    public void setEntrenadorCollection(Collection<Entrenador> entrenadorCollection) {
        this.entrenadorCollection = entrenadorCollection;
    }

    @XmlTransient
    public Collection<Partido> getPartidoCollection() {
        return partidoCollection;
    }

    public void setPartidoCollection(Collection<Partido> partidoCollection) {
        this.partidoCollection = partidoCollection;
    }

    @XmlTransient
    public Collection<Partido> getPartidoCollection1() {
        return partidoCollection1;
    }

    public void setPartidoCollection1(Collection<Partido> partidoCollection1) {
        this.partidoCollection1 = partidoCollection1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baloncestoliga.model.Equipo[ idEquipo=" + idEquipo + " ]";
    }
    
}
