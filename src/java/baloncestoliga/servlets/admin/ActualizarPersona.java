/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Equipo;
import baloncestoliga.model.Persona;
import baloncestoliga.model.facade.PersonaFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohammed
 */

@WebServlet(name = "ActualizarPersona", urlPatterns = {"/ActualizarPersona"})
public class ActualizarPersona extends HttpServlet {
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
        response.setContentType("text/html;charset=UTF-8");
       
        //cargar los datos del formulario
       
         String telefono = request.getParameter("telefono");
         String dni = request.getParameter("dni");
         
         
          if(request.getParameter("telefono").isEmpty() || request.getParameter("dni").isEmpty()){
            
            if(!request.getParameter("dni").isEmpty())
                request.getSession().setAttribute("dni", request.getParameter("dni"));
            if(!request.getParameter("telefono").isEmpty())
                request.getSession().setAttribute("telefono", request.getParameter("telefono"));
            
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            request.getRequestDispatcher("ModificarPersonaJSP.jsp").forward(request, response);
            //Crear pagina error de login
        
        }else{
         
            BigDecimal id_persona = personaFacade.findById(dni);
            personaFacade.UpdatePersona(id_persona, telefono);
            request.setAttribute("info", "¡Persona ACTUALIZADDA!");
            request.getRequestDispatcher("/adminjsp/ModificarPersonaJSP.jsp").forward(request, response);


    }
         
         
         
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
