/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 *
 * @author rcerrato
 */
@WebServlet(name = "SProcesar", urlPatterns = {"/SProcesar"})
public class SProcesar extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd;
        try {
            //HttpSession sesion=request.getSession(true);
            Integer accion=Integer.parseInt(request.getParameter("accion"));
            switch(accion){
                case 1:
                    rd=request.getRequestDispatcher("/Formulario.jsp?opcion=1");
                    rd.forward(request,response);
                    break;
                case 2:
                    //String cadena="";
                    //cadena+="<input type='checkbox' name='accion' value='1' >Consulta</input> ";
                    //request.setAttribute(); //para mandar un objeto que es recogido con el request
                    rd=request.getRequestDispatcher("/Formulario.jsp?opcion=2");
                    rd.forward(request,response);
                    break;
                case 3:
                    rd=request.getRequestDispatcher("http://localhost:8084/DatosPersonales/");
                    rd.forward(request,response);
                    
                    break;
                                
            }
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SProcesar</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SProcesar at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
             */
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
