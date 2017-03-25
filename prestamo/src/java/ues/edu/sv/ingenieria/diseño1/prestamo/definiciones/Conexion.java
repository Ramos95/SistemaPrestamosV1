package ues.edu.sv.ingenieria.diseño1.prestamo.definiciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */

public class Conexion {

    private String url = "jdbc:mysql://localhost:3306/baseDeDatos";
    //private String url = "jdbc:mysql://localhost:3306/baseDeDatos"; algunas veces es necesario cambiar localhost por 127.0.0.1
    private String login = "root"; //Administrador de MySQL
    private String password = "12345";
    private Connection conexion = null;
    private Statement statement = null;
    private ResultSet resulSet = null;

    //método para Update, Insert, Delete
    public void UID(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, password);
            statement = conexion.createStatement();
            statement.executeUpdate(sql); //statement
        } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1); //salir de aplicación
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.exit(1);
        }
    }

    //Método para Consultar
    public ResultSet getValores(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, login, password);
            statement = conexion.createStatement();
            resulSet = statement.executeQuery(sql);  //resultset
        } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.exit(1);
        } finally {
            return resulSet;
        }
    }

}
