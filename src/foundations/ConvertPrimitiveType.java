package foundations;

public class ConvertPrimitiveType {
    public static void main(String[] args) {
        double a = 1; //Implicit Conversion
        System.out.println(a);

        int b = 15000; //Explicit Conversion (CAST)
        short c = (short) b;
        System.out.println(c);

        int d = 128; //Explicit Conversion (CAST)
        byte e = (byte) d;
        //In this case the biggest value of byte is 127, so when i convert 128 to byte, it will go to the next value in byte which is the first (-128)
        //If I were to convert 129, it would go to -127 and so on.
        System.out.println(e);  

        double f = 1.99999;
        int g = (int) f;
        System.out.println(g);

    }
}
