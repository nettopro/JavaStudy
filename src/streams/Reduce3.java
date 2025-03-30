package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Student s1 = new Student("Anna",7.1);
        Student s2 = new Student("John",4.1);
        Student s3 = new Student("Tom",8.6);
        Student s4 = new Student("Gabe",9.2);
        
        List<Student> students = Arrays.asList(s1,s2,s3,s4);

        Predicate<Student> approved = a -> a.getGrade() >= 7;
        Function<Student,Double> justGrade = a -> a.getGrade();

        BiFunction<Average,Double,Average> calculateAverage = (average, grade) -> average.add(grade);

        BinaryOperator<Average> combineAverage = (a1,a2) -> Average.merge(a1, a2);

        Average average = students.stream()
            .filter(approved)
            .map(justGrade)
            .reduce(new Average(),calculateAverage,combineAverage);

        System.out.printf("Approved students average grade is %.2f", average.getValue());
    }
}
