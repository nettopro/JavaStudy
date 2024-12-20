package oo.composition;

import java.util.ArrayList;

public class Lesson {
    final String name;
    final ArrayList<Student> students = new ArrayList<>();

    Lesson(String name){
        this.name = name;
    }

    void addStudent(Student student){
        this.students.add(student);
        student.lessons.add(this);
    }
}
