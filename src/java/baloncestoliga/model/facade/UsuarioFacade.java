/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

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
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario login (String username, String password) {
    
        List <Usuario> user=em.createQuery("SELECT p FROM Usuario p WHERE p.username=:usnm AND p.password=:psw ")
                .setParameter("usnm", username)
                .setParameter("psw",password)
                .getResultList();
        
        return user.get(0);
    }
    
}
