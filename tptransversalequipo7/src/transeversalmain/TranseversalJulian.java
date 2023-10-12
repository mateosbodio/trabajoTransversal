

package transeversalmain;

import transeversal.persistencia.Conexion;
import java.sql.*;
public class TranseversalJulian {

    
    public static void main(String[] args) {
           Connection con;
        con = Conexion.getConexion();
       String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //alumno 1
            int dni = 30200666;
            String apellido = "Torrez";
            String nombre = "Gabriel";
            String fechaNac = "2000-01-15";
            boolean estado = true;

            ps.setInt(1, dni);
            ps.setString(2, apellido);
            ps.setString(3, nombre);
            ps.setString(4, fechaNac);
            ps.setBoolean(5, estado);
            ps.executeUpdate();

            int dni1 = 30200022;
            String apellido1 = "Rios";
            String nombre1 = "Julian";
            String fechaNac1 = "2000-01-23";
            boolean estado1 = true;

            ps.setInt(1, dni1);
            ps.setString(2, apellido1);
            ps.setString(3, nombre1);
            ps.setString(4, fechaNac1);
            ps.setBoolean(5, estado1);
            ps.executeUpdate();

            int dni2 = 57846786;
            String apellido2 = "Sturniolo";
            String nombre2 = "Bruno";
            String fechaNac2 = "2000-05-04";
            boolean estado2 = true;

            ps.setInt(1, dni2);
            ps.setString(2, apellido2);
            ps.setString(3, nombre2);
            ps.setString(4, fechaNac2);
            ps.setBoolean(5, estado2);
            ps.executeUpdate();
            
            int dni3 = 54587521;
            String apellido3 = "Suarez";
            String nombre3 = "Martin";
            String fechaNac3 = "2000-07-10";
            boolean estado3 = false;

            ps.setInt(1, dni3);
            ps.setString(2, apellido3);
            ps.setString(3, nombre3);
            ps.setString(4, fechaNac3);
            ps.setBoolean(5, estado3);
            ps.executeUpdate();
            
            int dni4 = 45674872;
            String apellido4 = "Sbodio";
            String nombre4 = "Mateo";
            String fechaNac4 = "2000-06-17";
            boolean estado4 = true;

            ps.setInt(1, dni4);
            ps.setString(2, apellido4);
            ps.setString(3, nombre4);
            ps.setString(4, fechaNac4);
            ps.setBoolean(5, estado4);
            ps.executeUpdate();
            System.out.println("Se cargo el alumno correctamente");
        } catch (SQLException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }

//       String sql1 = "INSERT INTO materia (nombre, año, estado) VALUES (?, ?, ?)";
//
//        try (PreparedStatement ps = con.prepareStatement(sql1)) {
//            //  materia
//            ps.setString(1, "Laboratorio"); 
//            ps.setInt(2, 2023); 
//            ps.setBoolean(3, true); 
//            ps.executeUpdate();
//
//            System.out.println("Se cargo la materia.");
//        } catch (SQLException e) {
//            System.err.println("Error al cargar datos: " + e.getMessage());
//
//        }
//      //metodo para mostar notas
//        String consulta = "SELECT a.idAlumno, a.dni, a.apellido, a.nombre, i.nota, m.nombre AS nombreMateria "
//                + "FROM alumno a "
//                + "INNER JOIN inscripcion i ON a.idAlumno = i.idAlumno "
//                + "INNER JOIN materia m ON i.idMateria = m.idMateria "
//                + "WHERE i.nota >= 8";
//
//        try (PreparedStatement ps = con.prepareStatement(consulta); 
//                ResultSet rs = ps.executeQuery()) {
//
//            while (rs.next()) {
//                int idAlumno = rs.getInt("idAlumno");
//                int dni = rs.getInt("dni");
//                String apellido = rs.getString("apellido");
//                String nombre = rs.getString("nombre");
//                int nota = rs.getInt("nota");
//                String nombreMateria = rs.getString("nombreMateria");
//
//                System.out.println("ID Alumno: " + idAlumno + ", DNI: " + dni + ", Apellido: " + apellido + ", Nombre: " + nombre + ", Nota: " + nota + ", Materia: " + nombreMateria);
//            }
//        } catch (SQLException e) {
//            System.out.println("error"+e.getMessage());
//        }
//
//
////metodo desincripccion.
//
// try {
//            PreparedStatement ps = null;
//            int idAlumno = 1; 
//            int idMateria = 1; 
//            String consulta1 = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
//            ps = con.prepareStatement(consulta1);
//                   
//            ps.setInt(1, idAlumno);
//            ps.setInt(2, idMateria);
//           
//            int filasAfectadas = ps.executeUpdate();
//            if (filasAfectadas > 0) {
//                System.out.println("desinscripcin ok.");
//            } else {
//                System.out.println("No hay  registros para desinscribir.");
//            }
//        } catch (SQLException e) {
//            System.err.println("Error: " + e.getMessage());
//        }

    }
    
}
    