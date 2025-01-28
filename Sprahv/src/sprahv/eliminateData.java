/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sprahv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */

public class eliminateData {

    public static void main(String[] args) {
        // Datos de conexión a MySQL
        String url = "jdbc:mysql://localhost:3307/sprahv";
        String user = "root";  
        String pass = "password";  

        Connection con = null;
        PreparedStatement declaracion = null;
        Scanner scanner = new Scanner(System.in);

        try {
            // Conectar a la base de datos
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a la base de datos.");

            // Pedir al usuario el ID a eliminar
            System.out.print("Ingrese el ID del empleado a eliminar: ");
            int id = scanner.nextInt();

            // Consulta SQL para eliminar
            String sql = "DELETE FROM empleados WHERE id = ?";
            declaracion = con.prepareStatement(sql);
            declaracion.setInt(1, id);

            // Ejecutar la eliminación
            int filasEliminadas = declaracion.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Registro eliminado correctamente.");
            } else {
                System.out.println("No se encontró el registro con el ID ingresado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (declaracion != null) declaracion.close();
                if (con != null) con.close();
                scanner.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

