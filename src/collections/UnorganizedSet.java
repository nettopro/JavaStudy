package collections;

import java.util.HashSet;
import java.util.Set;


@SuppressWarnings("unchecked")
public class UnorganizedSet {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashSet collection = new HashSet();

        collection.add(1.2); //double -> Double 
        collection.add(true); //boolean -> Boolean
        collection.add("Test"); // String
        collection.add(4); // int -> Integer
        collection.add('x'); // char -> Character

        System.out.println("Size is " + collection.size());
        collection.add("Test"); //Doesnt accept repetition (Size still 5)
        System.out.println("Size is " + collection.size());

        System.out.println(collection.remove("Test"));

        System.out.println("Size is " + collection.size());

        System.out.println(collection.contains('x'));
        System.out.println(collection.contains("Test"));
        Set nums = new HashSet();

        nums.add(1.2);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(collection);

        //collection.addAll(nums); //Adds all values from one collection to the other (Wont duplicate values in the case of set)
        //System.out.println(collection);

        collection.retainAll(nums); //Retains all similar values between the collections. (Intersection Union)
        System.out.println(collection);
    }
}
