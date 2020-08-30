/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.bean.Patient;
import com.dao.DeleteDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Himanshu Sharma
 */
public class SearchServ extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
          int ssnid=Integer.parseInt(request.getParameter("ssnid"));
         // String source=request.getParameter("source");
         // if(source.equals("search")){
           try{       
           Patient pt =DeleteDao.getDetail(ssnid);
                  // ArrayList<Patient> items = new ArrayList<Patient>();
                  // items.add(pt);
                  request.setAttribute("ssnid",pt.getSsnid());
                  request.setAttribute("name",pt.getName());
                  request.setAttribute("age",pt.getAge());
                  request.setAttribute("dateofadmission",pt.getDateofadmission());
                  request.setAttribute("bedtype",pt.getBedtype());
                  request.setAttribute("addr",pt.getAddr());                  
                  request.setAttribute("state",pt.getState());
                  request.setAttribute("city",pt.getCity());


                RequestDispatcher rd = request.getRequestDispatcher("Search_patient.jsp");
                rd.forward(request,response);
                
                //request.getRequestDispatcher("Search_patient.jsp").include(request, response);
                //out.println("<b><font color='green' size='10'>Patient searched successfully!!!</font></b>");
                //out.println("<b><font color='green' size='10'>"+pt.getAddr()+"</font></b>");
              
           }
           
         catch (IOException | SQLException | ServletException ex) {
                  out.print(ex);
              }
         // }
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
