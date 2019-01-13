/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

import baloncestoliga.model.Entrenador;
import baloncestoliga.model.Jugador;
import baloncestoliga.model.Usuario;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author inftel07
 */
@Stateless
public class EntrenadorFacade extends AbstractFacade<Entrenador> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntrenadorFacade() {
        super(Entrenador.class);
    }
    
    public Boolean rolEntr (Usuario u) {
    
        List <Entrenador> ents=em.createQuery("SELECT p FROM Entrenador p WHERE p.idPersona=:u")
                .setParameter("u", u.getPersonaIdPersona())
                .getResultList();
        if(ents.size()==1){
            return true;
        } else {
            return false;
        }
        
    }
    
    /*public BigDecimal findByDniE(BigDecimal id_entrenador){
        BigDecimal id = null;
        try{
        id = (BigDecimal) em.createQuery("SELECT e.id FROM Entrenador e WHERE e.id = ?1 ")
                .setParameter(1, id_entrenador)
                .getSingleResult();
        }catch(NoResultException e){
            id=null;
            return id;
            
        }
        return id;
    }*/
    
}
