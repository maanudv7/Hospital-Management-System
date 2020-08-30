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
//import java.text.ParseException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;*/
/**
 *
 * @author Himanshu Sharma
 */
public class UpdateServ extends HttpServlet {

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
        String action=request.getParameter("action");
        int ssnid=Integer.parseInt(request.getParameter("ssnid"));
	if("get".equals(action)){
        try
             {
                  Patient pt =DeleteDao.getDetail(ssnid);
	          request.setAttribute("ssnid",pt.getSsnid());
                  request.setAttribute("name",pt.getName());
                  request.setAttribute("age",pt.getAge());
                  request.setAttribute("doj",pt.getDateofadmission());
                  request.setAttribute("bed",pt.getBedtype());
                  request.setAttribute("add",pt.getAddr());                  
                  request.setAttribute("state",pt.getState());
                  request.setAttribute("city",pt.getCity());

   		
              RequestDispatcher rd = request.getRequestDispatcher("update_patient.jsp");
                  rd.forward(request,response);
              }
          catch (SQLException ex) {
                  out.print(ex);
              }
        }
         else if("update".equals(action)){
                 {
                     String name=request.getParameter("name");
                     int age=Integer.parseInt(request.getParameter("age"));
                     String dateofadmission=request.getParameter("dateodadmission");
                     String bedtype=request.getParameter("bedtype");
                     String addr=request.getParameter("addr");
                     String state=request.getParameter("state");
                     String city=request.getParameter("city");
                     
                     //Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dateofadmission);
                     
                     try
                     {
                         Patient p=new Patient(name,age, dateofadmission,bedtype,addr,city,state,ssnid);
                         boolean b=DeleteDao.update(p,ssnid);
                         if(b)
                         {
                             request.getRequestDispatcher("update_patient.jsp").include(request, response);
                             out.println("<b><font color='green' size='10'>Patient updated successfully!!!</font></b>");
                         }
                         else
                         {
                             request.getRequestDispatcher("update_patient.jsp").include(request, response);
                             out.println("<b><font color='red' size='10'>patient update failed!!!  </font></b>");
                             
                             
                         }
                         
                     }
                     catch(IOException | SQLException | ServletException e){
                         out.print(e);
                     }
                     
                     
                     
                     
                     
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



