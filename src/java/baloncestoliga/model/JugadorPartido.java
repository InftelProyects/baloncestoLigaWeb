/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author inftel07
 */
@Entity
@Table(name = "JUGADOR_PARTIDO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JugadorPartido.findAll", query = "SELECT j FROM JugadorPartido j")
    , @NamedQuery(name = "JugadorPartido.findByJugadorIdPersona", query = "SELECT j FROM JugadorPartido j WHERE j.jugadorPartidoPK.jugadorIdPersona = :jugadorIdPersona")
    , @NamedQuery(name = "JugadorPartido.findByPartidoIdPartido", query = "SELECT j FROM JugadorPartido j WHERE j.jugadorPartidoPK.partidoIdPartido = :partidoIdPartido")
    , @NamedQuery(name = "JugadorPartido.findByIdJugPart", query = "SELECT j FROM JugadorPartido j WHERE j.idJugPart = :idJugPart")
    , @NamedQuery(name = "JugadorPartido.findByAsistencias", query = "SELECT j FROM JugadorPartido j WHERE j.asistencias = :asistencias")
    , @NamedQuery(name = "JugadorPartido.findByPuntos", query = "SELECT j FROM JugadorPartido j WHERE j.puntos = :puntos")
    , @NamedQuery(name = "JugadorPartido.findByRebotes", query = "SELECT j FROM JugadorPartido j WHERE j.rebotes = :rebotes")})
public class JugadorPartido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected JugadorPartidoPK jugadorPartidoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_JUG_PART")
    private BigInteger idJugPart;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ASISTENCIAS")
    private BigInteger asistencias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PUNTOS")
    private BigInteger puntos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REBOTES")
    private BigInteger rebotes;
    @JoinColumn(name = "JUGADOR_ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Jugador jugador;
    @JoinColumn(name = "PARTIDO_ID_PARTIDO", referencedColumnName = "ID_PARTIDO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Partido partido;

    public JugadorPartido() {
    }

    public JugadorPartido(JugadorPartidoPK jugadorPartidoPK) {
        this.jugadorPartidoPK = jugadorPartidoPK;
    }

    public JugadorPartido(JugadorPartidoPK jugadorPartidoPK, BigInteger idJugPart, BigInteger asistencias, BigInteger puntos, BigInteger rebotes) {
        this.jugadorPartidoPK = jugadorPartidoPK;
        this.idJugPart = idJugPart;
        this.asistencias = asistencias;
        this.puntos = puntos;
        this.rebotes = rebotes;
    }

    public JugadorPartido(BigInteger jugadorIdPersona, BigInteger partidoIdPartido) {
        this.jugadorPartidoPK = new JugadorPartidoPK(jugadorIdPersona, partidoIdPartido);
    }

    public JugadorPartidoPK getJugadorPartidoPK() {
        return jugadorPartidoPK;
    }

    public void setJugadorPartidoPK(JugadorPartidoPK jugadorPartidoPK) {
        this.jugadorPartidoPK = jugadorPartidoPK;
    }

    public BigInteger getIdJugPart() {
        return idJugPart;
    }

    public void setIdJugPart(BigInteger idJugPart) {
        this.idJugPart = idJugPart;
    }

    public BigInteger getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(BigInteger asistencias) {
        this.asistencias = asistencias;
    }

    public BigInteger getPuntos() {
        return puntos;
    }

    public void setPuntos(BigInteger puntos) {
        this.puntos = puntos;
    }

    public BigInteger getRebotes() {
        return rebotes;
    }

    public void setRebotes(BigInteger rebotes) {
        this.rebotes = rebotes;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jugadorPartidoPK != null ? jugadorPartidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JugadorPartido)) {
            return false;
        }
        JugadorPartido other = (JugadorPartido) object;
        if ((this.jugadorPartidoPK == null && other.jugadorPartidoPK != null) || (this.jugadorPartidoPK != null && !this.jugadorPartidoPK.equals(other.jugadorPartidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baloncestoliga.model.JugadorPartido[ jugadorPartidoPK=" + jugadorPartidoPK + " ]";
    }
    
}
