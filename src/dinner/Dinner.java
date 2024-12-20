package dinner;

public class Dinner {
    public static void main(String[] args) {
        Food food1 = new Food("Rice",1,12);
        Food food2 = new Food("Beans",0.5,10);

        Person person1 = new Person("John",75);
        
        person1.eatFood(food1);
        System.out.println(person1.name + " : " + person1.weight + "kg");
        person1.eatFood(food2);
        System.out.println(person1.name + " : " + person1.weight + "kg");
    }
}
