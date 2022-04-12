package webpghw.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            String url = "jdbc:postgresql://localhost:5432/first_project_bookstore_db";
            String user = "postgres";
            String password = "rootroot";

            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }
}
