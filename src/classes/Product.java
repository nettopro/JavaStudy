package classes;

// You cannot use the keyword "this" in a static method or with static variables

// Note: Variables initialized for instances, (outside methods inside classes) will be initialized with default values
// Local variables (inside methods/constructors) will not be initialized and need to be initialized to be used
// Constant variables also need to be initialized, be they local or not, you can do it when you create the instance variable or inside the constructor.

// byte, short, int, long = 0
// float, double = 0.0
// boolean = false
// char = '\u0000'

public class Product {
    String name;
    double price;
    static double discount = 0.25;

    Product(){
        this("Product",15); // You only use this as a method within constructors and it will reference another constructor
    }
    
    Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    double priceWithDiscount(double managerDiscount){
        return this.price*(1-(discount + managerDiscount));
    }
}
