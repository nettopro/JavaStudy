package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePerson {
    public static void main(String[] args) throws SQLException{
        Scanner input = new Scanner(System.in);

        System.out.println("Insert person ID:");
        int idQuery = input.nextInt();

        Connection connection = ConnectionFactory.getConnection();

        String selectSQL = "SELECT * FROM people WHERE id = ?";
        String updateSQL = "UPDATE people SET name = ? WHERE id = ?";

        PreparedStatement stmt = connection.prepareStatement(selectSQL);
        stmt.setInt(1,idQuery);
        ResultSet result = stmt.executeQuery();

        if(result.next()){
            Person p = new Person(result.getInt(1),result.getString(2));
            
            System.out.println("Current name is: " + p.getName());
            input.nextLine();

            System.out.println("Set new name:");
            String newName = input.nextLine();

            stmt = connection.prepareStatement(updateSQL);
            stmt.setString(1, newName);
            stmt.setInt(2, idQuery);
            stmt.execute();

            System.out.println("Person altered with success!");
            
        } else {
            System.out.println("Person not found.");
        }

        
        stmt.close();
        connection.close();
        input.close(); 
    }
}
