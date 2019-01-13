/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Entrenador;
import baloncestoliga.model.facade.EntrenadorFacade;
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
 * @author beatrizillanesalcaide
 */
@WebServlet(name = "anadirEntrenadorServlet", urlPatterns = {"/anadirEntrenadorServlet"})
public class anadirEntrenadorServlet extends HttpServlet {

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
        
        //Sacar los datos del formulario
        
        String id_entrenador;
             
            id_entrenador= request.getParameter("id");
            int id2 = Integer.parseInt(id_entrenador);
            BigDecimal id4=new BigDecimal(id2);
     
        String nivel = request.getParameter("nivel");
      
       
        if(request.getParameter("nivel").isEmpty() || request.getParameter("id").isEmpty()){
            
            if(!request.getParameter("nivel").isEmpty())
                request.getSession().setAttribute("nivel", request.getParameter("nivel"));
            if(!request.getParameter("id").isEmpty())
                request.getSession().setAttribute("id", request.getParameter("id"));
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            request.getRequestDispatcher("AnadirEntrenadorJSP.jsp").forward(request, response); //Crear pagina error de login
        
        }
        else{
            
        Entrenador e = entrenadorFacade.find(id4);
            if(e == null){
                entrenadorFacade.create(e);
                request.setAttribute("info", "¡Entrenador Añadido!");
                request.getRequestDispatcher("/adminjsp/AnadirEntrenadorJSP.jsp").forward(request, response);
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
