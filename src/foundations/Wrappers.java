package foundations;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("123");
        Float f = 123.10F;
        Double d = 1234.5678;
        Long l = 1000000L;


        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(d*2);
        System.out.println(f-15);
        System.out.println(l/3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}
