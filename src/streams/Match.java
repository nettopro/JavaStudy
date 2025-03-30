package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Student s1 = new Student("Anna",7.1);
        Student s2 = new Student("John",4.1);
        Student s3 = new Student("Tom",8.6);
        Student s4 = new Student("Gabe",9.2);
        
        List<Student> students = Arrays.asList(s1,s2,s3,s4);

        Predicate<Student> approved = a -> a.getGrade() >= 7;
        //Predicate<Student> rejected = approved.negate();

        System.out.println(students.stream().allMatch(approved)); //All students are approved?
        System.out.println(students.stream().anyMatch(approved)); //At least one student approved?
        System.out.println(students.stream().noneMatch(approved)); //No students approved?
    }
}
