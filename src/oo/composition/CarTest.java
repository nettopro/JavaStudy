package oo.composition;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.isOn());

        c1.start();
        System.out.println(c1.isOn());
        System.out.println(c1.engine.rpm());

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

        System.out.println(c1.engine.rpm());

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();

        System.out.println(c1.engine.rpm());

        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();

        //Lacking Encapsulation!
        //c1.engine.pumpFactor = - 30;

        System.out.println(c1.engine.rpm());
    }
}
