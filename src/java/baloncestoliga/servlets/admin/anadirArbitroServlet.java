/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Arbitro;

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
 * @author beatrizillanesalcaide
 */
@WebServlet(name = "anadirArbitroServlet", urlPatterns = {"/anadirArbitroServlet"})
public class anadirArbitroServlet extends HttpServlet {

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

        //Sacar los datos del formulario
        
        String id;
             
            id = request.getParameter("id_arbitro");
            int id2 = Integer.parseInt(id);
            BigDecimal id4=new BigDecimal(id2);
            
        
        
        String provincia = request.getParameter("provincia");
        //String id_equipo = request.getParameter("id_equipo");
        
        
        
        if(request.getParameter("id_arbitro").isEmpty() || request.getParameter("provincia").isEmpty()){
            
            if(!request.getParameter("id_persona").isEmpty())
                request.getSession().setAttribute("id_persona", request.getParameter("id_persona"));
            if(!request.getParameter("provincia").isEmpty())
                request.getSession().setAttribute("provincia", request.getParameter("provincia"));
           /* if(!request.getParameter("id_equipo").isEmpty())
                request.getSession().setAttribute("id_equipo", request.getParameter("id_equipo"));*/
            
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            //request.getRequestDispatcher("AnadirArbitroJSP.jsp").forward(request, response); //Crear pagina error de login
        
        }
        
        else{
           
        Arbitro a = arbitroFacade.find(id4);
            if(a == null){
                arbitroFacade.create(a);
                request.setAttribute("info", "¡Arbitro creado!");    
           
                request.getRequestDispatcher("/adminjsp/AnadirArbitroJSP.jsp").forward(request, response);
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
