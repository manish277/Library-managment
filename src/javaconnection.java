/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Manish
 */

import java.sql.*;

import javax.swing.JOptionPane;
public class javaconnection {
    Connection con;
    public static Connection ConnectDb()
    {
    
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
    return con;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
     return null;
    }
       
    }

    
    
    
    
}
