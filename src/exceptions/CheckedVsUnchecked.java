package exceptions;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        try {
            generateError1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        generateError2();

        try {
            generateError3();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End!!!");
    }
    //Unchecked or unverified exception
    static void generateError1(){
        throw new RuntimeException("Really cool error occurred #01!");
    }
    //Checked or verified exception (Way of handling #1)
    static void generateError2() {
        try {
            throw new Exception("Really cool error occurred #02!");
        } catch (Exception e) {
            System.out.println("Very cool!");;
        }
    }
    //Checked or verified exception (Needs to be handled)
    static void generateError3() throws Exception{
        throw new Exception("Really cool error occurred #03!");

    } 
}
