package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataaSource {
    private static DataaSource instance;
    private Connection con;
    private final String URL = "jdbc:mysql://localhost:3306/Collections";
    private final String USERNAME = "root";
    private final String PASSWORD = "";

    private DataaSource() {
        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DataaSource getInstance() {
        if (instance == null) {
            instance = new DataaSource();
        }
        return instance;
    }

    public Connection getCon() {
        return con;
    }
}
