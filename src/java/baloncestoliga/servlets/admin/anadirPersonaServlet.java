/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;


import baloncestoliga.model.Persona;
import baloncestoliga.model.facade.PersonaFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author beatrizillanesalcaide
 */
@WebServlet(name = "anadirPersonaServlet", urlPatterns = {"/anadirPersonaServlet"})
public class anadirPersonaServlet extends HttpServlet {

    @EJB
    private PersonaFacade personaFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doGet(request, response);}
    
        
        /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        
       
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(request.getParameter("dni").isEmpty() || request.getParameter("nombre").isEmpty()
                || request.getParameter("apellidos").isEmpty() || request.getParameter("telefono").isEmpty() 
                || request.getParameter("fechaNacimiento").isEmpty()){
            if(!request.getParameter("dni").isEmpty())
                request.getSession().setAttribute("dni", request.getParameter("dni"));
            System.err.println("dni error");
            if(!request.getParameter("nombre").isEmpty())
                request.getSession().setAttribute("nombre", request.getParameter("nombre"));
            System.err.println("error nombre");
            if(!request.getParameter("apellidos").isEmpty())
                request.getSession().setAttribute("apellidos", request.getParameter("apellidos"));
            System.err.println("error apellidos");
            if(!request.getParameter("telefono").isEmpty())
                request.getSession().setAttribute("telefono", request.getParameter("telefono"));
            System.err.println("error telefono");
            if(!request.getParameter("fechaNacimiento").isEmpty())
                request.getSession().setAttribute("fechaNacimiento", request.getParameter("fechaNacimiento"));
            System.err.println("error fecha");
            /*if(!request.getParameter("rol").isEmpty())
                request.getSession().setAttribute("rol", request.getParameter("rol"));*/
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            request.getRequestDispatcher("PersonaJSP.jsp").forward(request, response); //Formulario
    }
        else{
            
            String dni = request.getParameter("dni");
            if(personaFacade.find(dni) != null){
                System.out.println("Ya esta registrada la persona");
            }
        
             else{
                Persona p = new Persona();
                p.setDni(request.getParameter("dni"));
                p.setNombre(request.getParameter("nombre"));
                p.setApellidos(request.getParameter("apellidos"));
                p.setTelefono(request.getParameter("telefono"));
                p.setFechaNacimiento(request.getParameter("fechaNacimiento"));
                //p.setRol(request.getParameter("rol"));
               // e.setEquipoIdEquipo(request.getParameter("equipoIdEquipo"))
               personaFacade.create(p);
               //request.getRequestDispatcher("")
                }
        }
        
   

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   
      
}
}

