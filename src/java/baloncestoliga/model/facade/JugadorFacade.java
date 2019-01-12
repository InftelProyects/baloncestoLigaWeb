/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

import baloncestoliga.model.Jugador;
import baloncestoliga.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author inftel07
 */
@Stateless
public class JugadorFacade extends AbstractFacade<Jugador> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JugadorFacade() {
        super(Jugador.class);
    }
    
    public Boolean rolJug (Usuario u) {
    
        List <Jugador> jugs=em.createQuery("SELECT p FROM Jugador p WHERE p.idPersona=:u")
                .setParameter("u", u.getPersonaIdPersona())
                .getResultList();
        if(jugs.size()==1){
            return true;
        } else {
            return false;
        }
        
    }
    
}
