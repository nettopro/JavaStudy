package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class LambdaChallengeSolution {
    public static void main(String[] args) {
        
        Function<Product,Double> realPrice = prod -> prod.price * (1 - prod.discount);

        UnaryOperator<Double> comumunalTax = price -> price >= 2500 ? price + price * 0.085 : price;

        UnaryOperator<Double> shippingCost = price -> price >= 3000 ? price + 100 : price + 50;

        UnaryOperator<Double> round = price -> Double.parseDouble(String.format("%.2f", price).replace(",","."));

        Function<Double,String> format = price -> ("R$" + price);

        Product p = new Product("TV", 2899.99, 0.1);

        String price = realPrice
        .andThen(comumunalTax)
        .andThen(shippingCost)
        .andThen(round)
        .andThen(format)
        .apply(p);

        System.out.println("The final price is: " + price);




    }
}
