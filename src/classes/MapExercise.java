package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExercise {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(1,"Robert");
        users.put(1, "Richard"); //Put can place or substitute value
        users.put(2,"John");
        users.put(3,"Carlos");
        users.put(4,"Megan");
        users.put(5,"Thomas");

        System.out.println(users.get(1));
        System.out.println(users.size());
        System.out.println(users.isEmpty());
        System.out.println(users.keySet()); //Get map keys
        System.out.println(users.values()); //Get map values
        System.out.println(users.entrySet()); //Get both map keys and values
        System.out.println(users.remove(4));

        for(int key : users.keySet()){
            System.out.println(key);
        }

        for(String value : users.values()){
            System.out.println(value);
        }

        for(Entry<Integer, String> register: users.entrySet()){
            System.err.print(register.getKey() + ": ");
            System.out.println(register.getValue());
        }

        
    }

}
