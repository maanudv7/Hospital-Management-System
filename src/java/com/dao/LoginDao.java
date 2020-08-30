/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.UserStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.util.DBConnection;

/**
 *
 * @author Himanshu Sharma
 */
public class LoginDao {
    
    public static boolean verifyUser(UserStore login)throws SQLException
    {   boolean userf=false;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select login,password from userstore where login=? and password=?");
        ps.setString(1,login.getLogin());
        ps.setString(2,login.getPassword());
        ResultSet r=ps.executeQuery();
       if(r !=null && r.next())
       {
           userf=true;
           
       }
       else
           userf=false;
       return userf;
}
}
