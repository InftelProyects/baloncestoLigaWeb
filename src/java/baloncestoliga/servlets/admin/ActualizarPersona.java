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
    
         String id = request.getParameter("id");
         int id2 = Integer.parseInt(id);
         BigDecimal id4=new BigDecimal(id2);
 
           Persona c = personaFacade.find(id4);
            if (personaFacade.find(id4) != null){
                c.setDni(request.getParameter("dni"));
                c.setNombre(request.getParameter("nombre"));
                c.setApellidos(request.getParameter("apellidos"));
                c.setTelefono(request.getParameter("telefono"));
                c.setFechaNacimiento(request.getParameter("fechaNacimiento"));
                personaFacade.edit(c);
            request.setAttribute("info", "¡Persona ACTUALIZADDA!");
            }
            else
            {
                request.setAttribute("info", "¡Persona no existe!");
            }
            request.getRequestDispatcher("/adminjsp/ModificarPersonaJSP.jsp").forward(request, response);
  
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
