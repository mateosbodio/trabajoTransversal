package transeversaljulian;

import transeversaljulian.persistencia.Conexion;
import java.sql.*;

public class TranseversalJulian {

    public static void main(String[] args) {

        
        Connection con;
        con = Conexion.getConexion();

        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //agregar alumno
            int dni = 45645100;
            String apellido = "Gimenez";
            String nombre = "Alicia";
            String fechaNac = "2002-05-30";
            boolean estado = false;

            ps.setInt(1, dni);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setString(4, fechaNac);
            ps.setBoolean(5, estado);
            ps.executeUpdate();

            System.out.println("Se cargo el alumno correctamente");
        } catch (SQLException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }

    }

}
