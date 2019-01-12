/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.servlets.main.*;
import baloncestoliga.model.Arbitro;
import baloncestoliga.model.Entrenador;
import baloncestoliga.model.Jugador;
import baloncestoliga.model.facade.ArbitroFacade;
import baloncestoliga.model.facade.EntrenadorFacade;
import baloncestoliga.model.facade.JugadorFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author inftel07
 */
@WebServlet(name = "participanservletADMIN", urlPatterns = {"/participanservletADMIN"})
public class participanservletADMIN extends HttpServlet {

    @EJB
    private JugadorFacade jugadorFacade;

    @EJB
    private EntrenadorFacade entrenadorFacade;

    @EJB
    private ArbitroFacade arbitroFacade;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            List <Entrenador> entrenadores= entrenadorFacade.findAll();
            request.setAttribute("entrenadores",entrenadores);
            List <Arbitro> arbitros= arbitroFacade.findAll();
            request.setAttribute("arbitros",arbitros);
             List <Jugador> jugadores= jugadorFacade.findAll();
            request.setAttribute("jugadores",jugadores);
            
            request.getRequestDispatcher("/adminjsp/persona.jsp").forward(request, response);
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
