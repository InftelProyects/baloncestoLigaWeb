/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Jugador;
import baloncestoliga.model.Usuario;
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
 * @author beatrizillanesalcaide
 */
@WebServlet(name = "anadirUsuarioServlet", urlPatterns = {"/anadirUsuarioServlet"})
public class anadirUsuarioServlet extends HttpServlet {

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

        //Sacar los datos del formulario
        
        String id;
             
            id = request.getParameter("id_usuario");
            int id2 = Integer.parseInt(id);
            BigDecimal id4=new BigDecimal(id2);
            
        String idp;
             
            idp = request.getParameter("id_persona");
            int id3 = Integer.parseInt(idp);
            BigDecimal id5 = new BigDecimal(id3); 
            
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        char c = '0';
        String rol;
        rol = Character.toString(c);
        rol = request.getParameter("rol");
        
            
        
        
        /*
        
        if(request.getParameter("id_arbitro").isEmpty() || request.getParameter("provincia").isEmpty()){
            
            if(!request.getParameter("id_arbitro").isEmpty())
                request.getSession().setAttribute("id_arbitro", request.getParameter("id_arbitro"));
            if(!request.getParameter("provincia").isEmpty())
                request.getSession().setAttribute("provincia", request.getParameter("provincia"));
           /* if(!request.getParameter("id_equipo").isEmpty())
                request.getSession().setAttribute("id_equipo", request.getParameter("id_equipo"));
            
            
            request.setAttribute("error", "Debe rellenar todos los campos");
            //request.getRequestDispatcher("AnadirArbitroJSP.jsp").forward(request, response); //Crear pagina error de login
        
        }
        
        else{
           */
            //Arbitro a = arbitroFacade.find(id4);
            if(usuarioFacade.find(id4) !=null){
                Usuario b = new Usuario(id4,username,password,email,rol);
                usuarioFacade.create(b);
                request.setAttribute("info", "¡Usuario creado!");    
           
                
            } else{
            request.setAttribute("info", "¡Persona no existe!");    
            }
            request.getRequestDispatcher("/adminjsp/AnadirUsuarioJSP.jsp").forward(request, response);
        //}              
        
    
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
