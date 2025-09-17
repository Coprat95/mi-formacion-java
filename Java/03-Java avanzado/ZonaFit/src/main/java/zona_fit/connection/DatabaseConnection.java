package zona_fit.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Clase que gestiona la conexión con la base de datos de PostgreSQL "zona_fit".
 * @author Oliver
 */
public class DatabaseConnection {

    /**
     * Establece y devuelve una conexión con la BDD de PostgreSQL.
     * @return Objeto Connection si se realiza la conexión o null en caso contrario.
     */
    public static Connection getConnection() {
        Connection connection = null;
        String database = "zona_fit";
        String url = "jdbc:postgresql://localhost:5432/" + database;
        String user = "postgres";
        String password = "ZonaFit2025!";

        // Cargamos el driver JDBC de PostgreSQL
        // Luego usamos DriverManager para establecer la conexión con la base de datos
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("No se ha podido encontrar la clase org.postgresql.Driver: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado al conectar con la BDD: " + e.getMessage());
        }

        return connection;
    }

    /**
     * Método principal para probar la conexión con la base de datos.
     */
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            System.out.println("Se ha conectado satisfactoriamente con la BDD.");
        } else {
            System.out.println("No se ha podido conectar con la BDD.");
        }
    }
}