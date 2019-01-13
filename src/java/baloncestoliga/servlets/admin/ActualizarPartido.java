/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Equipo;
import baloncestoliga.model.Partido;
import baloncestoliga.model.Persona;
import baloncestoliga.model.facade.EquipoFacade;
import baloncestoliga.model.facade.PartidoFacade;
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

@WebServlet(name = "ActualizarPartido", urlPatterns = {"/ActualizarPartido"})
public class ActualizarPartido extends HttpServlet {

    @EJB
    private EquipoFacade equipoFacade;

    @EJB
    private PartidoFacade partidoFacade;

    
    

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
         
         /*String idlocal = request.getParameter("idLocalint");
         int idlocalint = Integer.parseInt(idlocal);
         BigDecimal idlocalbig=new BigDecimal(idlocalint);
         Equipo eq = equipoFacade.find(idlocalbig);*/
 
           Partido e = partidoFacade.find(id4);
            if (partidoFacade.find(id4) != null){
                e.setFecha(request.getParameter("fecha"));
                e.setLocalizacion(request.getParameter("localizacion"));
                e.setResultado(request.getParameter("resultado"));
                e.setJornada(request.getParameter("jornada"));
              //e.setEquipoIdEquipo(request.getParameter(id));
              //e.setEquipoIdEquipo1(request.getParameter("idVisitante"));
                partidoFacade.edit(e);
            request.setAttribute("info", "¡Partido actualizado!");
            }
            else
            {
                request.setAttribute("info", "¡El partido no existe!");
            }
            request.getRequestDispatcher("/adminjsp/ModificarPartido.jsp").forward(request, response);
  
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
