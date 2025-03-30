package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Student s1 = new Student("John",7.8);
        Student s2 = new Student("Mary",9.5);
        Student s3 = new Student("Paul",6.0);
        Student s4 = new Student("Anna",8.2);
        Student s5 = new Student("Tom",5.4);
        Student s6 = new Student("Lucy",9.2);

        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6);
    
        Predicate<Student> isApproved = s -> s.getGrade() >= 7;
        Function<Student,String> congratulations = s -> "Congratulations " + s.getName() + " you've been approved!";

        students.stream()
        .filter(isApproved)
        .map(congratulations)
        .forEach(System.out::println);
    }
}
