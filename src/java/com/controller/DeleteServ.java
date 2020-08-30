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
public class DeleteServ extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String action2=request.getParameter("action");
        int ssnid=Integer.parseInt(request.getParameter("ssnid"));
       
        
        if("get".equals(action2)){
         // Patient pt=new Patient();
         try{      
                  Patient pt =DeleteDao.getDetail(ssnid);
                  // ArrayList<Patient> items = new ArrayList<Patient>();
                  // items.add(pt);
                  request.setAttribute("ssnid",pt.getSsnid());
                  request.setAttribute("name",pt.getName());
                  request.setAttribute("age",pt.getAge());
                  request.setAttribute("doj",pt.getDateofadmission());
                  request.setAttribute("bed",pt.getBedtype());
                  request.setAttribute("add",pt.getAddr());                  
                  request.setAttribute("state",pt.getState());
                  request.setAttribute("city",pt.getCity());


                  RequestDispatcher rd = request.getRequestDispatcher("Delete_patient.jsp");
                  rd.forward(request,response);
         }
         catch (SQLException ex) {
                  out.print(ex);
              }
              }
        else if("delete".equals(action2)){
            try {
                Boolean b =DeleteDao.deletePatient(ssnid);
                if(b)
                     {
                     request.getRequestDispatcher("Delete_patient.jsp").include(request, response);
                     out.println("<b><font color='green' size='10'>Patient deleted successfully!!!</font></b>");
                     }
                 else
                     {
                        request.getRequestDispatcher("Delete_patient.jsp").include(request, response);
                       out.println("<b><font color='red' size='10'>patient with given ssnid couldn't be delete!!!  </font></b>");
                     }
            }
            catch (SQLException ex) {
                 out.print(ex);
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





