/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.model.facade;

import baloncestoliga.model.Persona;
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
public class PersonaFacade extends AbstractFacade<Persona> {

    @PersistenceContext(unitName = "baloncestoLigaWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    public Persona login (String nombre, String dni) {
    
        List <Persona> user=em.createQuery("SELECT p FROM Persona p WHERE p.nombre =: nombre AND p.dni=:dni ")
                .setParameter("nombre", nombre)
                .setParameter("dni",dni)
                .getResultList();
        
        return user.get(0);
    }
    
    public String findByDni(String persona_dni){
        String dni = null;
        try{
        dni = (String) em.createQuery("SELECT p.dni FROM Persona p WHERE p.dni = ?1 ")
                .setParameter(1, persona_dni)
                .getSingleResult();
        }catch(NoResultException e){
            dni=null;
            return dni;
            
        }
        return dni;
    }
    
}
