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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "PARTIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partido.findAll", query = "SELECT p FROM Partido p")
    , @NamedQuery(name = "Partido.findByIdPartido", query = "SELECT p FROM Partido p WHERE p.idPartido = :idPartido")
    , @NamedQuery(name = "Partido.findByFecha", query = "SELECT p FROM Partido p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Partido.findByLocalizacion", query = "SELECT p FROM Partido p WHERE p.localizacion = :localizacion")
    , @NamedQuery(name = "Partido.findByResultado", query = "SELECT p FROM Partido p WHERE p.resultado = :resultado")
    , @NamedQuery(name = "Partido.findByJornada", query = "SELECT p FROM Partido p WHERE p.jornada = :jornada")})
public class Partido implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PARTIDO")
    private BigDecimal idPartido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "FECHA")
    private String fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LOCALIZACION")
    private String localizacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "RESULTADO")
    private String resultado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "JORNADA")
    private String jornada;
    @JoinColumn(name = "EQUIPO_ID_EQUIPO", referencedColumnName = "ID_EQUIPO")
    @ManyToOne(optional = false)
    private Equipo equipoIdEquipo;
    @JoinColumn(name = "EQUIPO_ID_EQUIPO1", referencedColumnName = "ID_EQUIPO")
    @ManyToOne(optional = false)
    private Equipo equipoIdEquipo1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partido")
    private Collection<JugadorPartido> jugadorPartidoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partidoIdPartido")
    private Collection<Arbitro> arbitroCollection;

    public Partido() {
    }

    public Partido(BigDecimal idPartido) {
        this.idPartido = idPartido;
    }

    public Partido(BigDecimal idPartido, String fecha, String localizacion, String resultado, String jornada) {
        this.idPartido = idPartido;
        this.fecha = fecha;
        this.localizacion = localizacion;
        this.resultado = resultado;
        this.jornada = jornada;
    }

    public BigDecimal getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(BigDecimal idPartido) {
        this.idPartido = idPartido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Equipo getEquipoIdEquipo() {
        return equipoIdEquipo;
    }

    public void setEquipoIdEquipo(Equipo equipoIdEquipo) {
        this.equipoIdEquipo = equipoIdEquipo;
    }

    public Equipo getEquipoIdEquipo1() {
        return equipoIdEquipo1;
    }

    public void setEquipoIdEquipo1(Equipo equipoIdEquipo1) {
        this.equipoIdEquipo1 = equipoIdEquipo1;
    }

    @XmlTransient
    public Collection<JugadorPartido> getJugadorPartidoCollection() {
        return jugadorPartidoCollection;
    }

    public void setJugadorPartidoCollection(Collection<JugadorPartido> jugadorPartidoCollection) {
        this.jugadorPartidoCollection = jugadorPartidoCollection;
    }

    @XmlTransient
    public Collection<Arbitro> getArbitroCollection() {
        return arbitroCollection;
    }

    public void setArbitroCollection(Collection<Arbitro> arbitroCollection) {
        this.arbitroCollection = arbitroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPartido != null ? idPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partido)) {
            return false;
        }
        Partido other = (Partido) object;
        if ((this.idPartido == null && other.idPartido != null) || (this.idPartido != null && !this.idPartido.equals(other.idPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baloncestoliga.model.Partido[ idPartido=" + idPartido + " ]";
    }
    
}
