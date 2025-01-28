/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprahv;
import java.sql.*;
/**
 *
 * @author ASUS
     */
public class DBconnection {
   static String url="jdbc:mysql://localhost:3307/sprahv";
   static String user="root";
   static String pass="";
    
    public static Connection Conectar()
    {
        Connection con=null;
        try 
        {
           con=DriverManager.getConnection(url,user,pass);
               System.out.println("Conexion exitosa");
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return con;
        }
    }
