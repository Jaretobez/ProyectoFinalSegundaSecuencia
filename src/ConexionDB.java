import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase para gestionar la conexión a la base de datos.
 */
public class ConexionDB {
    private Connection SQLconexion;

    /**
     * Constructor de la clase. Establece la conexión a la base de datos.
     */
    public ConexionDB() {
        // Ruta URL Base de datos
        String host = "localhost";
        String puerto = "3306";
        String nameBD = "airsoft";

        // Acceder a URL
        String usuario = "root";
        String pass = "";

        // Driver
        String driver = "com.mysql.cj.jdbc.Driver";

        // Construir URL
        String databaseURL = "jdbc:mysql://" + host + ":" + puerto + "/" + nameBD + "?useSSL=false";

        try {
            Class.forName(driver);
            SQLconexion = DriverManager.getConnection(databaseURL, usuario, pass);
            System.out.println("Base de datos Conectada");
        } catch (ClassNotFoundException | SQLException ex) {
            // Maneja el error de alguna manera apropiada para tu aplicación
            ex.printStackTrace();
        }
    }

    /**
     * Obtiene la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
    public Connection getConectarDB() {
        return SQLconexion;
    }

    /**
     * Crea un objeto Statement para la conexión a la base de datos.
     *
     * @return Un objeto Statement.
     */
    public Statement createStatement() {
        try {
            if (SQLconexion != null && !SQLconexion.isClosed()) {
                return SQLconexion.createStatement();
            } else {
                System.err.println("Error: La conexión no está activa.");
                return null;
            }
        } catch (SQLException e) {
            // Maneja el error de alguna manera apropiada para tu aplicación
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Crea un objeto PreparedStatement para la conexión a la base de datos.
     *
     * @param sql La consulta SQL.
     * @return Un objeto PreparedStatement.
     */
    public PreparedStatement prepareStatement(String sql) {
        try {
            if (SQLconexion != null && !SQLconexion.isClosed()) {
                return SQLconexion.prepareStatement(sql);
            } else {
                System.err.println("Error: La conexión no está activa.");
                return null;
            }
        } catch (SQLException e) {
            // Maneja el error de alguna manera apropiada para tu aplicación
            e.printStackTrace();
            return null;
        }
    }
}
