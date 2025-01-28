/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprahv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/sprahv";
        String user = "root";
        String pass = "";

        Connection con = null;
        PreparedStatement declaracion = null;
        
        try{
            //establecer la conexion
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion exitosa a la base de datos");
            
             // Preparar la sentencia SQL
            String sql = "INSERT INTO nombre_tabla (columna1, columna2) VALUES (?, ?)";
            declaracion = con.prepareStatement(sql);
            
            // Asignar valores a los parámetros
            declaracion.setString(1, "valor1");
            declaracion.setInt(2, 123);
            
            // Ejecutar la inserción
            int filasAfectadas = declaracion.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Inserción exitosa.");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            // Cerrar recursos
            try {
                if (declaracion != null) declaracion.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
