package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest{
    public static void main(String[] args) throws SQLException{

        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "caramba1905";
        
        Connection connection = DriverManager
            .getConnection(url, user, password);

        System.out.println("Connection successful!");
        connection.close();

    }
}
