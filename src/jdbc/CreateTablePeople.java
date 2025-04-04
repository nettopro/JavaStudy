package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class CreateTablePeople {
    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        String sql = """ 
        CREATE TABLE pessoas(
            id INT AUTO_INCREMENT PRIMARY KEY,
            name VARCHAR(80) NOT NULL
            )
        """;

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("Table created successfully!");
        connection.close();
    }
}
