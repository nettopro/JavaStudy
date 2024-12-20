package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        
        List<User> list = new ArrayList<>();

        User u1 = new User("Robert");

        list.add(u1);
        list.add(new User("John"));
        list.add(new User("Carlos"));
        list.add(new User("Carlos")); //Allows repetition
        list.add(new User("Beth"));
        list.add(new User("Britanny"));
        

        System.out.println(list.get(3)); //Access value by index 

        list.remove(1); //Removes John (at index 1)

        list.remove(new User("Carlos")); //Remove by name

        System.out.println(list.contains(new User("Beth")));

        for(User u: list){
            System.out.println(u.name);
        }
    }
}
