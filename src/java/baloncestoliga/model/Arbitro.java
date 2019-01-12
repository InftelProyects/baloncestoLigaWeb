/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author inftel07
 */
@Entity
@Table(name = "ARBITRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arbitro.findAll", query = "SELECT a FROM Arbitro a")
    , @NamedQuery(name = "Arbitro.findByIdPersona", query = "SELECT a FROM Arbitro a WHERE a.idPersona = :idPersona")
    , @NamedQuery(name = "Arbitro.findByProvincia", query = "SELECT a FROM Arbitro a WHERE a.provincia = :provincia")})
public class Arbitro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONA")
    private BigDecimal idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "PROVINCIA")
    private String provincia;
    @JoinColumn(name = "PARTIDO_ID_PARTIDO", referencedColumnName = "ID_PARTIDO")
    @ManyToOne(optional = false)
    private Partido partidoIdPartido;
    @JoinColumn(name = "ID_PERSONA", referencedColumnName = "ID_PERSONA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Persona persona;

    public Arbitro() {
    }

    public Arbitro(BigDecimal idPersona) {
        this.idPersona = idPersona;
    }

    public Arbitro(BigDecimal idPersona, String provincia) {
        this.idPersona = idPersona;
        this.provincia = provincia;
    }

    public BigDecimal getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(BigDecimal idPersona) {
        this.idPersona = idPersona;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Partido getPartidoIdPartido() {
        return partidoIdPartido;
    }

    public void setPartidoIdPartido(Partido partidoIdPartido) {
        this.partidoIdPartido = partidoIdPartido;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
        if (!(object instanceof Arbitro)) {
            return false;
        }
        Arbitro other = (Arbitro) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "baloncestoliga.model.Arbitro[ idPersona=" + idPersona + " ]";
    }
    
}
