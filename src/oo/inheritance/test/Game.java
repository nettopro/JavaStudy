package oo.inheritance.test;

import oo.inheritance.Hero;
import oo.inheritance.Monster;

public class Game {
    public static void main(String[] args) {
        Monster p1 = new Monster();
        p1.y = 10;
        p1.x = 10;

        Hero p2 = new Hero(10,11);
        
        System.out.println(p1.hp);
        System.out.println(p2.hp);
        
        p1.attack(p2);
        p2.attack(p1);

        System.out.println(p1.hp);
        System.out.println(p2.hp);

        /* p1.walk(Direction.NORTE);
        p1.walk(Direction.NORTE);
        p1.walk(Direction.NORTE);
        p1.walk(Direction.NORTE);
        p1.walk(Direction.OESTE);
        p1.walk(Direction.OESTE);
        p1.walk(Direction.OESTE);
        p1.walk(Direction.SUL); 
        System.out.println(p1.y);
        System.out.println(p1.x); */
    }
}
