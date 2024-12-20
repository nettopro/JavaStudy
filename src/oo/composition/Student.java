package oo.composition;

import java.util.ArrayList;

public class Student {
    final String name;
    final ArrayList<Lesson> lessons = new ArrayList<>();

    Student(String name){
        this.name = name;
    }

    void addLesson(Lesson lesson){
        this.lessons.add(lesson);
        lesson.students.add(this);
    }

    Lesson getLessonByName(String name){
        
        for(Lesson lesson: this.lessons){
            if(lesson.name.equalsIgnoreCase(name)){
                return lesson;
            }
        }
        return null;
    }

    public String toString(){
        return name;
    }

}
