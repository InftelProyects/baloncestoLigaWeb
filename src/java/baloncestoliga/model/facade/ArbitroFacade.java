/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

import baloncestoliga.model.Arbitro;
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
public class ArbitroFacade extends AbstractFacade<Arbitro> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArbitroFacade() {
        super(Arbitro.class);
    }
    
    public Boolean rolArb (Usuario u) {
    
        List <Arbitro> arbs=em.createQuery("SELECT p FROM Arbitro p WHERE p.idPersona=:u")
                .setParameter("u", u.getPersonaIdPersona())
                .getResultList();
        if(arbs.size()==1){
            return true;
        } else {
            return false;
        }
    }
    
}
