package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<User>();

        users.add(new User("John"));
        users.add(new User("Foden"));
        users.add(new User("Migda"));

        System.out.println(users.contains(new User("Guilherme")));
        
    }
}
