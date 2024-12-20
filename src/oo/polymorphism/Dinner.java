package oo.polymorphism;

public class Dinner {
    public static void main(String[] args) {
        Person p1 = new Person(99.65);

        Rice rice = new Rice(0.20);
        Beans beans = new Beans(0.1);
        // Food food = new Food(0.3); Abstract classes cannot be instanciated        

        p1.eat(rice);
        p1.eat(beans);

        System.out.println(p1.getWeight());

        IceCream iceCream = new IceCream(.9);
        
        p1.eat(iceCream);

        System.out.printf("%.2f",p1.getWeight());
    }
}
