/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

import baloncestoliga.model.JugadorPartido;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author inftel07
 */
@Stateless
public class JugadorPartidoFacade extends AbstractFacade<JugadorPartido> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JugadorPartidoFacade() {
        super(JugadorPartido.class);
    }
    
}
