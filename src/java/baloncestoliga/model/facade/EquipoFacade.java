/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

import baloncestoliga.model.Equipo;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 *
 * @author inftel07
 */
@Stateless
public class EquipoFacade extends AbstractFacade<Equipo> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoFacade() {
        super(Equipo.class);
    }
    
   public String findByNombre(String equipo_nombre){
        String nombre = null;
        try{
        nombre = (String) em.createQuery("SELECT e.nombre FROM Equipo e WHERE e.nombre = ?1 ")
                .setParameter(1, equipo_nombre)
                .getSingleResult();
        }catch(NoResultException e){
            nombre=null;
            return nombre;
            
        }
        return nombre;
    }
   
   public void UpdateEquipo(String nombre,String categoria){
         
      em.createQuery( "UPDATE EQUIPO E SET E.CATEGORIA=?1 WHERE E.NOMBRE = ?2")
              .setParameter(1, nombre)
              .setParameter(2,categoria)
              .executeUpdate();
     }
   
    
}
