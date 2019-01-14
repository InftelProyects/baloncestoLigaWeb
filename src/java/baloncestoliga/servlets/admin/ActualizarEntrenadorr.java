/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Arbitro;
import baloncestoliga.model.Entrenador;
import baloncestoliga.model.facade.EntrenadorFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohammed
 */
public class ActualizarEntrenadorr extends HttpServlet {
    @EJB
    private EntrenadorFacade entrenadorFacade;

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
        String idEntrenador  = request.getParameter("idEntrenador ");
        String nivel = request.getParameter("nivel");
        String idIq   = request.getParameter("idIq");
         
       int id2 = Integer.parseInt(idEntrenador );
       BigDecimal id4 = new BigDecimal(id2);
       Entrenador c = entrenadorFacade.find(id4);
      
       if(entrenadorFacade.find(id4)!= null){
           c.setNivel(request.getParameter("provencia"));
           entrenadorFacade.edit(c);
           request.setAttribute("info", "¡Entrenador actualizada");
       }else{
           request.setAttribute("info", "¡Entrenador no existe¡");
       }
         request.getRequestDispatcher("/adminjsp/ModificarEntrenadorJSP.jsp").forward(request,response);
      
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
