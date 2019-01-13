/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baloncestoliga.servlets.admin;

import baloncestoliga.model.Arbitro;
import baloncestoliga.model.Jugador;
import baloncestoliga.model.facade.JugadorFacade;
import baloncestoliga.model.facade.PersonaFacade;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@WebServlet(name = "anadirJugadorServlet", urlPatterns = {"/anadirJugadorServlet"})
public class anadirJugadorServlet extends HttpServlet {

    @EJB
    private PersonaFacade personaFacade;

    @EJB
    private JugadorFacade jugadorFacade;
    
    
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
             
            id = request.getParameter("id_jugador");
            int id2 = Integer.parseInt(id);
            BigDecimal id4=new BigDecimal(id2);
            
        String dorsal;
             
            dorsal = request.getParameter("dorsal");
            int id3 = Integer.parseInt(dorsal); 
            //BigInteger id7 = new BigInteger(id3);
            BigInteger bi = BigInteger.valueOf(id3);
            
        String altura;
             
            altura = request.getParameter("altura");
            int id5 = Integer.parseInt(altura);  
            BigInteger bi2 = BigInteger.valueOf(id5);
            
        String peso;
             
            peso = request.getParameter("peso");
            int id6 = Integer.parseInt(peso); 
            BigInteger bi3 = BigInteger.valueOf(id6);
            
        String idequipo;
             
            idequipo = request.getParameter("id_equipo");
            int id10 = Integer.parseInt(idequipo);
            BigDecimal id9 = new BigDecimal(id10);    
        
        
       
        //String id_equipo = request.getParameter("id_equipo");
        
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
            if(personaFacade.find(id4) !=null){
                Jugador b = new Jugador(id4,bi2,bi3,bi,id9);
                jugadorFacade.create(b);
                request.setAttribute("info", "¡Jugador creado!");    
           
                
            } else{
            request.setAttribute("info", "¡Persona no existe o Equipo no existe!");    
            }
            request.getRequestDispatcher("/adminjsp/AnadirArbitroJSP.jsp").forward(request, response);
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
