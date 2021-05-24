package Finanzas.datos;

//CONEXION
/*
    @author Diego Vásquez
*/
import java.sql.*;

public class Conexion {
    
    private static final String JDBC_URL = "jdbc:mysql://localhost/finanzas?useSSL=false&serverTimezone=UTC";
    private static final String JDBC_USER = "root";
<<<<<<< HEAD
    private static final String JDBC_PASS = "";
=======
    private static final String JDBC_PASS = "informaticdv2016";
>>>>>>> f065c6e061c26e8e9fc84fc9c3966ceb5fe02a56


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }
   
}
