package dinner;

public class Person {
    String name;
    double weight;

    Person(String name,double weight){
        this.name = name;
        this.weight = weight;
    }

    double eatFood(Food food){
        System.out.println(name + " Ate " + food.name + "!");
        return weight += food.weight; 
    }
}
