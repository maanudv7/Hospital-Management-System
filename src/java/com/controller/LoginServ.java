/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.bean.UserStore;
import com.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Himanshu Sharma
 */
public class LoginServ extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
                
            String username=request.getParameter("username");
             String pswd=request.getParameter("password");
             
             String err=null;
             if(username==null || username.equals("") )
             {
                 err="User name cant be null";
             }
             if(pswd==null || pswd.equals("") )
             {
                 err="password cant be null";
             }
             if(err != null)
             {
                 RequestDispatcher r=request.getRequestDispatcher("login.html");
                 out.println(err);
                 r.include(request,response);
                 
                 
             }
             else
             { 
                 try
             {
                 UserStore p=new UserStore(username,pswd);
                 boolean b=LoginDao.verifyUser(p);
                 if(b)
                 {
                     out.println("<font size='8' color='green'><b>user logged in!!!</font></b> ");
                     request.getRequestDispatcher("navbar.html").include(request, response);
                    // HttpSession session=request.getSession();  
                    // session.setAttribute("name",name);  
                 }
                 else
                 {
                     out.println("<font size='8' color='red'><b>user not found</font></b> ");
                     request.getRequestDispatcher("login.html").include(request, response);

                 }
                 
             }
             catch(Exception e){};
             
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
