
package transeversal.persistencia;

import java.sql.*;

import javax.swing.JOptionPane;

/**
<<<<<<<< Updated upstream:src/transeversal/persistencia/Conexion.java
<<<<<<<< Updated upstream:src/transeversaljulian/persistencia/Conexion.java
 *
 * @author Julian Development
 */

========
 
 * @author Julian Rios
 */
>>>>>>>> Stashed changes:src/transeversal/persistencia/Conexion.java
========
 
 * @author Julian Rios
 */
>>>>>>>> Stashed changes:tptransversalequipo7/src/transeversal/persistencia/Conexion.java
public class Conexion {
    
    private static String url = "jdbc:mariadb://localhost/universidadulptransversal";    
    private static String usuario = "root";
    private static String password = "";
    private static Conexion conexion;
    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("carga driver ok");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error carga driver");
        }
    }

    public static Connection getConexion() {
        Connection con = null;

        if (conexion == null) {
            conexion = new Conexion();
        }

        try {
            con = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" + "&user=" + usuario + "&password=" + password);
            System.out.println("conexion ok");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error conexion");
        }
        return con;
    }
    
}
