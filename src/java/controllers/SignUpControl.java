/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import Entity.User;
import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author msi-pc
 */
@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignUpControl extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        String phone = request.getParameter("phone");
        String email = request.getParameter("mail");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
       
        if (!pass.equals(re_pass)) {
            response.sendRedirect("signup2.jsp");
        } else {
            DAO dao = new DAO();
            User u = dao.checkAccountExist(user);
            if (u == null) {
                // duocj sign up
                dao.signup(user, pass, phone, email, gender, address);
                response.sendRedirect("Home.jsp");

            } else {
                // day ve trang login.jsp
                request.setAttribute("errors", "Username already exist");
                response.sendRedirect("login.jsp");
            }

        }
        // sign uo truyen user vao bang account

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
       // processRequest(request, response);
               response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String re_pass = request.getParameter("repass");
        String phone = request.getParameter("phone");
        String email = request.getParameter("mail");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
       
        if (!pass.equals(re_pass)) {
            response.sendRedirect("signup2.jsp");
        } else {
            DAO dao = new DAO();
            User u = dao.checkAccountExist(user);
            if (u == null) {
                // duocj sign up
                dao.signup(user, pass, phone, email, gender, address);
                response.sendRedirect("Home.jsp");

            } else {
                // day ve trang login.jsp
                response.sendRedirect("login.jsp");
            }

        }
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
