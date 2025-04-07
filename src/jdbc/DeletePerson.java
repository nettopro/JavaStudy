package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {
    public static void main(String[] args) throws SQLException{

        Scanner input = new Scanner(System.in);
        Connection connection = ConnectionFactory.getConnection();
        System.out.println("Insert id to delete: ");
        int idQuery = input.nextInt();
        String sql = "DELETE FROM people WHERE id = ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, idQuery);

        if(stmt.executeUpdate() > 0){
            System.out.println("Person deleted successfully");
        } else {
            System.out.println("Nothing done.");
        }

        connection.close();
        input.close();
    }
}
