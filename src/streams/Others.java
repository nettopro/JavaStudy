package streams;

import java.util.Arrays;
import java.util.List;

public class Others {
    public static void main(String[] args) {
        Student s1 = new Student("Anna",7.1);
        Student s2 = new Student("John",4.1);
        Student s3 = new Student("Tom",8.6);
        Student s4 = new Student("Gabe",9.2);
        Student s5 = new Student("Jonas",6.2);
        Student s6 = new Student("Gabe",9.2);
        Student s7 = new Student("John",4.1);
        Student s8 = new Student("Anna",7.1);
        
        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8);

        System.out.println("Distinct");
        students.stream()
            .distinct()
            .forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        students.stream()
            .distinct()
            .skip(3)
            .limit(1)
            .forEach(System.out::println);

        System.out.println("\ntakeWhile");
        students.stream()
            .distinct()
            .takeWhile(a -> a.getGrade() >= 7)
            .forEach(System.out::println);    
    }
}
