package daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCSDL {
    static private String jdbcURL = "jdbc:mysql://localhost:3306/qlhv";
    static private String jdbcUsername = "root";
    static private String jdbcPassword = "Nenthihue1995";
    static Connection connection = null;

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
