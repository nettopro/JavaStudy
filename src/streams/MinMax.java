package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Student s1 = new Student("Anna",7.1);
        Student s2 = new Student("John",4.1);
        Student s3 = new Student("Tom",8.6);
        Student s4 = new Student("Gabe",9.2);
        
        List<Student> students = Arrays.asList(s1,s2,s3,s4);

        Comparator<Student> bestGrade = (student1, student2) -> {
            if(student1.getGrade() > student2.getGrade()) return 1;
            if(student1.getGrade() < student2.getGrade()) return -1;
            return 0;
        };

        System.out.println(students.stream().max(bestGrade).get()); //Best grade
        System.out.println(students.stream().min(bestGrade).get()); //Worst grade

        
    }
}
