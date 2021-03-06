/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.controller;

import baloncestoliga.model.Usuario;
import baloncestoliga.model.facade.UsuarioFacade;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author inftel07
 */
@WebServlet(name = "EnterController", urlPatterns = {"/EnterController"})
public class EnterController extends HttpServlet {

    @EJB
    private UsuarioFacade usuarioFacade;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sesion=request.getSession();
        String uname,psw;
        uname = request.getParameter("uname");
        psw = request.getParameter("psw");
        Usuario usuario=usuarioFacade.login(uname,psw);
        String url="";
        if (uname!= null) {
            if(usuario.getRol()=='0'){
                url = "/userController?userid="+usuario.getIdUsuario();
            } else if(usuario.getRol()=='1'){
                url = "/adminController?adminid="+usuario.getIdUsuario();
            }
                
	} else {
            url="/BalonLigaController";
        }
        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher(url);
	requestDispatcher.forward(request, response);
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
