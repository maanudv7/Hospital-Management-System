/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.bean.Patient;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.util.DBConnection;

/**
 *
 * @author Himanshu Sharma
 */
public class RegisterDao {
    
     public static boolean addPatient(Patient user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        String qry="Select * from patient where ssnid=?";
        boolean status =true;
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setInt(1,user.getSsnid());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
         status=false;
        else{
         qry="insert into patient values(?,?,?,?,?,?,?,?)";
           ps=conn.prepareStatement(qry);
           ps.setString(1,user.getName());
           ps.setInt(2,user.getAge());
           ps.setString(3,user.getDateofadmission());
           ps.setString(4,user.getBedtype());
           ps.setString(5,user.getAddr());
           ps.setString(6,user.getState());
           ps.setString(7,user.getCity());
           ps.setInt(8,user.getSsnid());
           
           int i=ps.executeUpdate();
        }
        return status;
            
        
        
    }
    
    
    
}
