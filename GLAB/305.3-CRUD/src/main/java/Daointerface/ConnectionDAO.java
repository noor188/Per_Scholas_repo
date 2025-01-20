package Daointerface;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDAO {
    static Connection conn = null;

    public static Connection getConnection() {
        final String dburl = "jdbc:mysql://localhost:3306/library";
        final String dbuser = "root";
        final String dbpassword = "password";
        try {
            conn = DriverManager.getConnection(dburl, dbuser, dbpassword);
            System.out.println("Connected Database Successfully");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void disconnect() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
