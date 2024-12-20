package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class OrganizedSet {
    public static void main(String[] args) {
        //Set<String> approvedList = new HashSet<>();
        SortedSet<String> approvedList = new TreeSet<>(); //TreeSet sorts alphabettically if not provided a custom comparator
        approvedList.add("John");
        approvedList.add("Clara");
        approvedList.add("Ciara");
        approvedList.add("Zoe");

        for(String candidate : approvedList){
            System.out.println(candidate);    
        }

        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        //Cant access by index in Sets.

        for(int number : nums){
            System.out.println(number);
        }
        
    }    
}
