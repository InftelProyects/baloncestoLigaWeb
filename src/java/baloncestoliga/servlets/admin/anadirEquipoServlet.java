/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Equipo;
import baloncestoliga.model.facade.EquipoFacade;
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
 * @author inftel07
 */
@WebServlet(name = "anadirEquipoServlet", urlPatterns = {"/anadirEquipoServlet"})
public class anadirEquipoServlet extends HttpServlet {

    @EJB
    private EquipoFacade equipoFacade;

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
       
        
        String nombre = request.getParameter("nombre");
        String categoria = request.getParameter("categoria");
        
        
        
        if(request.getParameter("nombre").isEmpty() || request.getParameter("categoria").isEmpty()){
            
            if(!request.getParameter("nombre").isEmpty())
                request.getSession().setAttribute("nombre", request.getParameter("nombre"));
            if(!request.getParameter("categoria").isEmpty())
                request.getSession().setAttribute("categoria", request.getParameter("categoria"));
            
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            request.getRequestDispatcher("AnadirEquipoJSP.jsp").forward(request, response); //Crear pagina error de login
        
        }
        
        else{
            
        String existe = equipoFacade.findByNombre(nombre);//lo q coge del form
            if(existe == null){
                Equipo e = new Equipo(nombre,categoria);
                equipoFacade.create(e);
                
                request.setAttribute("info", "¡Equipo Añadido!");
                request.getRequestDispatcher("/adminjsp/AnadirEquipoJSP.jsp").forward(request, response);
                
            } 
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
