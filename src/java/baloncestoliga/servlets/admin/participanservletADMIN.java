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
import baloncestoliga.model.Persona;
import baloncestoliga.model.Usuario;
import baloncestoliga.model.facade.ArbitroFacade;
import baloncestoliga.model.facade.EntrenadorFacade;
import baloncestoliga.model.facade.JugadorFacade;
import baloncestoliga.model.facade.PersonaFacade;
import baloncestoliga.model.facade.UsuarioFacade;
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
    private UsuarioFacade usuarioFacade;

    @EJB
    private PersonaFacade personaFacade;

    @EJB
    private JugadorFacade jugadorFacade;

    @EJB
    private EntrenadorFacade entrenadorFacade;

    @EJB
    private ArbitroFacade arbitroFacade;
    

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String type=request.getParameter("type"); 
            List <Persona> personas;
            List <Entrenador> entrenadores;
            List <Arbitro> arbitros;
            List <Jugador> jugadores;
            List <Usuario> usuarios;
            switch(type){
                case "GestPersona":  personas= personaFacade.findAll();
                                     request.setAttribute("personas",personas);
                    break;
                case "GestEntrenador":  entrenadores= entrenadorFacade.findAll();
                                        request.setAttribute("personas",entrenadores);
                    break;
                case "GestArbitro":  arbitros= arbitroFacade.findAll();
                                    request.setAttribute("personas",arbitros);
                    break;
                case "GestJugador":  jugadores= jugadorFacade.findAll();
                                    request.setAttribute("personas",jugadores);
                    break;
                case "GestUsuarios":  usuarios= usuarioFacade.findAll();
                                        request.setAttribute("personas",usuarios);
                    break;
                default : type="adminhome";
                    
            }
         
            request.getRequestDispatcher("/adminjsp/"+type+".jsp").forward(request, response);
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
