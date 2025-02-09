/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuarios;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "SVusuario", urlPatterns = {"/SVusuario"})
public class SVusuario extends HttpServlet {

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
        List<Usuarios> ListaUsuarios = new ArrayList<>();
        ListaUsuarios.add(new Usuarios("21455876","Maria","Perez","4444444","mamamia@prueba.com"));
        ListaUsuarios.add(new Usuarios("143676764","Melisa","Panameno","111111111","fefe333@prueba.com"));
        ListaUsuarios.add(new Usuarios("8767544","Manolia","Suarez","555555555","rareriroru@prueba.com"));
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("ListaUsuarios", ListaUsuarios);
        
        response.sendRedirect("mostrarUsuarios.jsp");
        
        
        
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
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        System.out.println("Dni es: " + dni);
        System.out.println("Nombre es: " + nombre);
        System.out.println("Apellido es: " + apellido);
        System.out.println("Telefono es: " + telefono);
        System.out.println("Email es: " + email);
        
        
        
        
        
        
        
        
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
