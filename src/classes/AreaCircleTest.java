package classes;

public class AreaCircleTest {
    public static void main(String[] args) {
        AreaCircle a1 = new AreaCircle(10);
        a1.radius = 15;
        AreaCircle a2 = new AreaCircle(12);
        a2.radius = 25;
        //AreaCircle.pi = 3.1415; If this variables value wasnt constant thats how you would alter it if it were only static.
        System.out.println(a1.area());
        System.out.println(a2.area());
        System.out.println(AreaCircle.area(30));
        System.out.println(AreaCircle.PI);
        System.out.println(Math.PI);
    }
}
