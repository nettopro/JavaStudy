package exceptions;

public class Basic {
    public static void main(String[] args) {

        Student s1 = null;

        try {
            printStudent(s1);
        } catch(Exception e) {
          System.out.println("Error when printing username");  
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred : " + e.getMessage());
            //e.printStackTrace();
        }

        System.out.println("Fim!!");
    }

    public static void printStudent(Student student){
        System.out.println(student.getName());
    }
}
