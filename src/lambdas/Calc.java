package lambdas;

@FunctionalInterface
public interface Calc {
    
    double execute(double a, double b);

    default String cool(){
        return "cool";
    }

    static String cooler(){
        return "cooler";
    }

}