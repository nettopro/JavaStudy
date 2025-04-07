package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryPeople2 {
    public static void main(String[] args) throws SQLException{
        Scanner input = new Scanner(System.in);

        System.out.println("Insert part of name:");
        String nameQuery = input.nextLine();

        Connection connection = ConnectionFactory.getConnection();

        String sql = "SELECT * FROM people where (name) like ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,"%" + nameQuery + "%");
        ResultSet result = stmt.executeQuery();

        List<Person> people = new ArrayList<>();

        while(result.next()){
            int id = result.getInt("id");
            String name = result.getString("name");
            people.add(new Person(id, name));                
        }

        for(Person p: people){
            System.out.println(p.getId() + " ==> " + p.getName());
        }

        stmt.close();
        connection.close();
        input.close();        
    }
}
