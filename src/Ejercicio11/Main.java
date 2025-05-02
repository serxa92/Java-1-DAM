package Ejercicio11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/netflixdb";
        String user = "root";
        String pass = "citroenC4";

        // try-with-resources: los recursos se cierran automáticamente
        try (
                Connection connection = DriverManager.getConnection(url, user, pass);
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM actores");
        ) {
            // Procesar los resultados
            while (rs.next()) {
                System.out.println(rs.getString("nombre") + " " + rs.getString("fecha_nacimiento"));
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar o consultar la base de datos:");
            e.printStackTrace();
        }
    }
}
