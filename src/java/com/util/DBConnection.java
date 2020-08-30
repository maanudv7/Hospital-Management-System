/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Himanshu Sharma
 */
public class DBConnection {
/*    private static Connection conn;//private=encapsulation,static =to make a single connection.
    static  //static block runs only one time
    {
         try
     { 
     Class.forName("oracle.jdbc.OracleDriver");
    conn=DriverManager.getConnection("jdbc:oracle:thin:@//Desktop-JHR5HNQ:1521/xe","management","management");//Desktop-JHR5HNQ:1521/xe=name of computer
                                                                                                    //system=username,oracle=password
    JOptionPane.showMessageDialog(null,"connected successfully");
     }
     catch(Exception e)
     {
     e.printStackTrace();
     JOptionPane.showMessageDialog(null,"cannot connected successfully");
     }
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null,"disconnect successfully");
            
        }
        catch(Exception e)
        {e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Exception"+e);
        }
    }
*/

    public static Connection getConnection() throws SQLException {
        
    String url = "jdbc:mysql://localhost:3307/management";    
     String driverName = "com.mysql.cj.jdbc.Driver";   
     String username = "root";   
     String password = "Football7#";
     Connection con = null;
    //private static String urlstring;
        
        
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println(ex+"SQL exception hua"); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println(ex+"class fail huyi"); 
        }
        return con;
    }
}
