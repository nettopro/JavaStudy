package oo.composition;

public class LessonTest {
    public static void main(String[] args) {
        Student student1 = new Student("John");
        Student student2 = new Student("Rebecca");
        Student student3 = new Student("Ingrid");

        Lesson lesson1 = new Lesson("Complete Java Course");
        Lesson lesson2 = new Lesson("Zig Starter to Expert");
        Lesson lesson3 = new Lesson("Math");

        lesson1.addStudent(student1);
        lesson1.addStudent(student2);

        lesson2.addStudent(student1);
        lesson2.addStudent(student3);

        student1.addLesson(lesson3);
        student2.addLesson(lesson3);
        student3.addLesson(lesson3);

        for(Student student : lesson3.students){
            System.out.println("Im enrolled in lesson " + lesson3.name);
            System.out.println("My name is : " + student.name);
        }

        System.out.println(student1.lessons.get(0).students);

        Lesson lessonFound = student1.getLessonByName("Complete Java Course");

        if(lessonFound != null){
            System.out.println(lessonFound.name);
            System.out.println(lessonFound.students);
        }
    }
}
