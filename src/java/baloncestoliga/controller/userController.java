/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.controller;

import baloncestoliga.model.Arbitro;
import baloncestoliga.model.Entrenador;
import baloncestoliga.model.Jugador;
import baloncestoliga.model.Usuario;
import baloncestoliga.model.facade.ArbitroFacade;
import baloncestoliga.model.facade.EntrenadorFacade;
import baloncestoliga.model.facade.JugadorFacade;
import baloncestoliga.model.facade.UsuarioFacade;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
@WebServlet(name = "userController", urlPatterns = {"/userController"})
public class userController extends HttpServlet {

    @EJB
    private JugadorFacade jugadorFacade;

    @EJB
    private EntrenadorFacade entrenadorFacade;

    @EJB
    private ArbitroFacade arbitroFacade;

    @EJB
    private UsuarioFacade usuarioFacade;
    
    
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                 
                String id = request.getParameter("userid") ;
                int ide=Integer.parseInt(id);
                BigDecimal bg= new BigDecimal(ide);
                Usuario pers=usuarioFacade.find(bg);
                request.setAttribute("usuario", pers);
                Character p;
                BigDecimal bb=pers.getPersonaIdPersona().getIdPersona();
                if(jugadorFacade.find(bb)!=null){
                    p='j';
                } else if(entrenadorFacade.find(bb)!=null){
                    p='e';
                } else if(arbitroFacade.find(bb)!=null){
                    p='r';
                }else {
                    p='i';
                }
                String rol="";
                Jugador jueg;
                Arbitro arb;
                Entrenador ent;
                 String menu="";
                List <Arbitro> arbpar=new ArrayList<Arbitro>();
                if(p.equals('j')){
                    request.setAttribute("imagen", "imgs/jugador.jpg");
                    rol="Jugador";
                    menu="menu";
                    jueg=jugadorFacade.find(bb);
                    request.setAttribute("rolling", jueg);
                } else if (p.equals('r')){
                    request.setAttribute("imagen", "imgs/arbitro.jpg");
                    rol="Arbitro";
                    menu="menua";
                    arb=arbitroFacade.find(bb);
                    arbpar=arbitroFacade.findAll();
                    request.setAttribute("rolling", arb);
                    request.setAttribute("all", arbpar);
                } else if (p.equals('e')) {
                    request.setAttribute("imagen", "imgs/entrenador.jpg");
                    rol="Entrenador";
                    menu="menu";
                    ent=entrenadorFacade.find(bb);
                    request.setAttribute("rolling", ent);
                } else {
                    request.setAttribute("imagen", "imgs/usuario.jpg");
                    rol="Usuario";
                }
                request.setAttribute("typemenu", menu);
                request.setAttribute("userol", rol);
                
                
                Date hoy=new Date();
                request.setAttribute("hoy", hoy);
                String url = "";
		String list = request.getParameter("userlist");
           
		
               if (list != null) {
                    if(list.equals("perfil") || list.equals("equipo")) {
                        String base = "/";
                        String ext="servlet";
                        url = base+list+ext;
                        
                    } else {
                        String base = "/userjsp/";
                        String ext=".jsp";
                        url = base+list+ext;
                    }
                        
		} else {
                    url="/userjsp/userhome.jsp";
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
