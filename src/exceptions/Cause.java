package exceptions;

public class Cause {
    public static void main(String[] args) {
        try {
            methodA(null);
        } catch (IllegalArgumentException e) {
            if(e.getCause() != null){
                System.out.println(e.getCause().getMessage());
            }
        }

        methodA(null);
    }

    static void methodA(Student student) {
        try {
            methodB(student);
        } catch (Exception cause) {
            throw new IllegalArgumentException(cause);
        }
    }

    static void methodB(Student student) {
        if(student == null){
            throw new NullPointerException("Student is NULL!!!!!!!");
        }

        System.out.println(student.getName());
    }
}
