package classes;

public class AreaCircle {
    double radius;
    static final double PI = 3.1415; 
    //Static defines a variable that will be applied to every single instance of the class
    //Final defines a constant variable (immutable).
    AreaCircle(double initialRadius){
        radius=initialRadius;
    }

    double area(){
        return Math.pow(radius,2) * PI;
    }

    static double area(double radius){
        return PI * Math.pow(radius,2);
    }
}
