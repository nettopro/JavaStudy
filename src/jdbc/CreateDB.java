package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "caramba1905";
        
        Connection connection = DriverManager
            .getConnection(url, user, password);

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS java_course");
        
        System.out.println("Database created!");
        connection.close();
    }
}
