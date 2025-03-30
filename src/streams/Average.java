package streams;

public class Average {

    private double total;
    private int quantity;

    public Average add(double value){
        total += value;
        quantity++;
        return this;
    }

    public double getValue(){
        return total/quantity;
    }

    public static Average merge(Average a1,Average a2){
        Average result = new Average();
        result.quantity = a1.quantity + a2.quantity;
        result.total = a1.total + a2.total;
        return result;
    }
}
