/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Arbitro;
import baloncestoliga.model.Equipo;
import baloncestoliga.model.facade.ArbitroFacade;
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

@WebServlet(name = "ActualizarArb", urlPatterns = {"/ActualizarArb"})
public class ActualizarArb extends HttpServlet {
    @EJB
    private ArbitroFacade arbitroFacade;

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
         String idArb  = request.getParameter("idArb");
         String provencia  = request.getParameter("provencia");
         String idPar   = request.getParameter("idPar");
         
       int id2 = Integer.parseInt(idArb);
       BigDecimal id4 = new BigDecimal(id2);
       Arbitro c = arbitroFacade.find(id4);
      
       if(arbitroFacade.find(id4)!= null){
           c.setProvincia(request.getParameter("provencia"));
           arbitroFacade.edit(c);
           request.setAttribute("info", "¡Equipo actualizada");
       }else{
           request.setAttribute("info", "¡Equipo no existe¡");
       }
         request.getRequestDispatcher("/adminjsp/ModificarArbitroJSP.jsp").forward(request,response);
      
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
