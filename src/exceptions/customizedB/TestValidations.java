package exceptions.customizedB;

import exceptions.Student;

public class TestValidations {
    public static void main(String[] args) {

        try {
            Student student = new Student("Ana",7);
            Validate.user(student);
            Validate.user(null);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (NumberOutsideInterval | IllegalArgumentException e) {
            System.out.println(e.getMessage() + "!!!");
        }

        // Validate.student(null) //Needs to be handled since its an Exception and not a Runtime Exception. 

        System.out.println("End!!!");
    }
}