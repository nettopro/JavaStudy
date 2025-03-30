package exceptions.customizedB;

import exceptions.Student;

public class Validate {
    private Validate(){}

    public static void user(Student student) throws EmptyStringException, NumberOutsideInterval{
        if(student == null) {
            throw new IllegalArgumentException("Student is null");
        }

        if(student.getName() == null || student.getName().trim().isEmpty()){
            throw new EmptyStringException("name");
        }

        if(student.getGrade() < 0 || student.getGrade() > 10){
            throw new NumberOutsideInterval("grade");
        }
    }
}
