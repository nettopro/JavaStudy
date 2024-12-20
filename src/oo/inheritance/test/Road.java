package oo.inheritance.test;

import oo.inheritance.challenge.Car;
import oo.inheritance.challenge.FordFocus;
import oo.inheritance.challenge.LamborghiniAventador;

public class Road {
    public static void main(String[] args) {
        Car ford = new FordFocus();
        LamborghiniAventador lambo = new LamborghiniAventador();

        System.out.println(ford.accelerate());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.accelerate());

        System.out.println(" ");

        lambo.turboOn();

        System.out.println("Will accelerate: " + lambo.getAcceleration());
        System.out.println("Current Speed: " + lambo.accelerate());

        lambo.airConOn();
        lambo.turboOff();
        
        System.out.println("Will accelerate: " + lambo.getAcceleration());
        System.out.println("Current Speed: " +  lambo.accelerate());

    }
}
