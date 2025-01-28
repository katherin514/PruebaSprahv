/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprahv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class ConsutData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3307/sprahv";
        String user = "root"; 
        String pass = "password"; 
        
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a MySQL.");
            
            // Consulta de datos
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM nombre_tabla";
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Nombre: " + resultSet.getString("nombre"));
            }
            
            // Cerrar conexiones
            resultSet.close();
            statement.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

