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
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author inftel07
 */
@Embeddable
public class JugadorPartidoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "JUGADOR_ID_PERSONA")
    private BigInteger jugadorIdPersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PARTIDO_ID_PARTIDO")
    private BigInteger partidoIdPartido;

    public JugadorPartidoPK() {
    }

    public JugadorPartidoPK(BigInteger jugadorIdPersona, BigInteger partidoIdPartido) {
        this.jugadorIdPersona = jugadorIdPersona;
        this.partidoIdPartido = partidoIdPartido;
    }

    public BigInteger getJugadorIdPersona() {
        return jugadorIdPersona;
    }

    public void setJugadorIdPersona(BigInteger jugadorIdPersona) {
        this.jugadorIdPersona = jugadorIdPersona;
    }

    public BigInteger getPartidoIdPartido() {
        return partidoIdPartido;
    }

    public void setPartidoIdPartido(BigInteger partidoIdPartido) {
        this.partidoIdPartido = partidoIdPartido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jugadorIdPersona != null ? jugadorIdPersona.hashCode() : 0);
        hash += (partidoIdPartido != null ? partidoIdPartido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JugadorPartidoPK)) {
            return false;
        }
        JugadorPartidoPK other = (JugadorPartidoPK) object;
        if ((this.jugadorIdPersona == null && other.jugadorIdPersona != null) || (this.jugadorIdPersona != null && !this.jugadorIdPersona.equals(other.jugadorIdPersona))) {
            return false;
        }
        if ((this.partidoIdPartido == null && other.partidoIdPartido != null) || (this.partidoIdPartido != null && !this.partidoIdPartido.equals(other.partidoIdPartido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baloncestoliga.model.JugadorPartidoPK[ jugadorIdPersona=" + jugadorIdPersona + ", partidoIdPartido=" + partidoIdPartido + " ]";
    }
    
}
