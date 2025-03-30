package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Anna",7.1);
        Student s2 = new Student("John",4.1);
        Student s3 = new Student("Tom",8.6);
        Student s4 = new Student("Gabe",9.2);
        
        List<Student> students = Arrays.asList(s1,s2,s3,s4);

        Predicate<Student> approved = a -> a.getGrade() >= 7;
        Function<Student,Double> justGrade = a -> a.getGrade();
        BinaryOperator<Double> sum = (a,b) -> a + b;

        students.parallelStream()
            .filter(approved)
            .map(justGrade)
            .reduce(sum)
            .ifPresent(System.out::println);
    }
}
