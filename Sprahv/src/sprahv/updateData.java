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

public class updateData {

    public static void main(String[] args) {
        // Datos de conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/nombre_base_datos";
        String user = "root";  // Usuario de MySQL
        String pass = "password";  // Contraseña de MySQL

        Connection con = null;
        PreparedStatement declaracion = null;

        try {
            // Conectar con la base de datos
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a la base de datos.");

            // Sentencia SQL para actualizar un registro
            String sql = "UPDATE empleados SET nombre = ?, puesto = ?, salario = ? WHERE id = ?";
            declaracion = con.prepareStatement(sql);

            // Asignar valores a los parámetros
            declaracion.setString(1, "Carlos García");  // Nombre
            declaracion.setString(2, "Gerente");        // Puesto
            declaracion.setBigDecimal(3, new java.math.BigDecimal("4500.00"));  // Salario
            declaracion.setInt(4, 1);  // ID del registro a actualizar

            // Ejecutar la consulta
            int filasActualizadas = declaracion.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("El registro se actualizó exitosamente.");
            } else {
                System.out.println("No se encontró el registro con el ID especificado.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
