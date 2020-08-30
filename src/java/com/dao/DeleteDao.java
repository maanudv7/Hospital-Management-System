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
import java.sql.Statement;
import com.util.DBConnection;

/**
 *
 * @author Himanshu Sharma
 */
public class DeleteDao {
 public static Patient getDetail(int id) throws SQLException{
     Patient pt=new Patient();
    // String qry="Select * from patient where ssnid='id'";
        Connection conn=DBConnection.getConnection();
      // Statement s=conn.createStatement();
      // s.executeQuery(qry);
       // ResultSet rs = s.getResultSet();
        PreparedStatement ps = conn.prepareStatement("select * from patient where ssnid=?");
	ps.setInt(1, id);
	ResultSet rs = ps.executeQuery();
       while (rs.next ()){
            pt.setSsnid(rs.getInt("ssnid"));
            pt.setName(rs.getString("name"));
            pt.setAge(rs.getInt("age"));
            pt.setDateofadmission(rs.getString("dateofadmission"));
            pt.setBedtype(rs.getString("bedtype"));
            pt.setAddr(rs.getString("addr"));
            pt.setState(rs.getString("state"));
            pt.setCity(rs.getString("city"));
            }
       
       return pt;
   }

    public static Boolean deletePatient(int ssnid) throws SQLException {
       boolean rowdeleted;
       Connection conn=DBConnection.getConnection();
       String qry="delete from patient where ssnid=?";
       PreparedStatement statement= conn.prepareStatement(qry);
       statement.setInt(1,ssnid);
      rowdeleted=statement.executeUpdate()>0;
       
       return rowdeleted;
        }
    
    
public static Patient View(int id) throws SQLException{
     Patient pt=new Patient();
     String qry="Select * from patient where ssnid=id";
        Connection conn=DBConnection.getConnection();
       Statement s=conn.createStatement();
       s.executeQuery(qry);
        ResultSet rs = s.getResultSet();
       while (rs.next ()){
            pt.setName(rs.getString("name"));
            pt.setAge(rs.getInt("age"));
            pt.setDateofadmission(rs.getString("dateofadmission "));
            pt.setBedtype(rs.getString("bedtype "));
            pt.setAddr(rs.getString("addr"));
            pt.setState(rs.getString("state"));
            pt.setCity(rs.getString("city"));
            }
       
       return pt;
   }
public static boolean update(Patient user,int id) throws SQLException{
        boolean status;
        Connection conn=DBConnection.getConnection();
          String qry="update patient set name = ?,age=?,dateofadmission=?,bedtype=?,addr=?,state=?,city=? where ssnid=?;";
          PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,user.getName());
           ps.setInt(2,user.getAge());
           ps.setString(3,user.getDateofadmission());
           ps.setString(4,user.getBedtype());
           ps.setString(5,user.getAddr());
           ps.setString(6,user.getState());
           ps.setString(7,user.getCity());
           ps.setInt(8,id);
           
           status=ps.executeUpdate()>0;
  
        return status;
            
        
        
    }

    
    
}