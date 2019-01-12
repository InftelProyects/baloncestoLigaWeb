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
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Sacar los datos del formulario
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");
        String telefono = request.getParameter("telefono");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        
        
        if(request.getParameter("dni").isEmpty() || request.getParameter("nombre").isEmpty() || request.getParameter("apellidos").isEmpty()
                || request.getParameter("telefono").isEmpty() || request.getParameter("fechaNacimiento").isEmpty()){
            
            if(!request.getParameter("dni").isEmpty())
                request.getSession().setAttribute("dni", request.getParameter("dni"));
            if(!request.getParameter("nombre").isEmpty())
                request.getSession().setAttribute("nombre", request.getParameter("nombre"));
            if(!request.getParameter("apellidos").isEmpty())
                request.getSession().setAttribute("apellidos", request.getParameter("apellidos"));
            if(!request.getParameter("telefono").isEmpty())
                request.getSession().setAttribute("telefono", request.getParameter("telefono"));
            if(!request.getParameter("fechaNacimiento").isEmpty())
                request.getSession().setAttribute("fechaNacimiento", request.getParameter("fechaNacimiento"));
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            request.getRequestDispatcher("AnadirPersonaJSP.jsp").forward(request, response); //Crear pagina error de login
        
        }
        
        else{
            
        String existe = personaFacade.findByDni(dni);//lo q coge del form
            if(existe == null){
                Persona p = new Persona(dni,nombre,apellidos,telefono,fechaNacimiento);
                /*p.setDni(request.getParameter("dni"));
                p.setNombre(request.getParameter("nombre"));
                p.setApellidos(request.getParameter("apellidos"));
                p.setTelefono(request.getParameter("telefono"));
                p.setFechaNacimiento(request.getParameter("fechaNacimiento")); */
                personaFacade.create(p);
            } 
        }              
        
    }
   
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}

