/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Equipo;
import baloncestoliga.model.Persona;
import baloncestoliga.model.Usuario;
import baloncestoliga.model.facade.PersonaFacade;
import baloncestoliga.model.facade.UsuarioFacade;
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

@WebServlet(name = "ActualizarUsuario", urlPatterns = {"/ActualizarUsuario"})
public class ActualizarUsuario extends HttpServlet {

    @EJB
    private PersonaFacade personaFacade;

    @EJB
    private UsuarioFacade usuarioFacade;
    

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
         
         String id3 = request.getParameter("idPersona");
         int id22 = Integer.parseInt(id3);
         BigDecimal id42=new BigDecimal(id22);
         
         String rol=request.getParameter("rol");
         char c = rol.charAt(0);
         
           Usuario u = usuarioFacade.find(id4);
            if (usuarioFacade.find(id4) != null){
                u.setUsername(request.getParameter("username"));
                u.setPassword(request.getParameter("password"));
                u.setEmail(request.getParameter("email"));
                u.setRol(c);
                Persona persona=personaFacade.find(id42);
                u.setPersonaIdPersona(persona);
                usuarioFacade.edit(u);
            request.setAttribute("info", "¡usuario actualizado!");
            }
            else
            {
                request.setAttribute("info", "¡Usuario o persona no existen!");
            }
            request.getRequestDispatcher("/adminjsp/ModificarUsuario.jsp").forward(request, response);
  
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
