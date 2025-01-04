package lambdas;

import java.util.function.Function;

public class LambdaChallenge {
    public static void main(String[] args) {
        
        Function<Product,Double> realPrice = prod -> prod.price * (1 - prod.discount);

        Function<Double,Double> comumunalTax = price -> price >= 2500 ? price + price * 0.085 : price;

        Function<Double,Double> shippingCost = price -> price >= 3000 ? price + 100 : price + 50;

        Product p = new Product("TV", 2899.99, 0.1);

        System.out.format("R$%.2f", realPrice.andThen(comumunalTax).andThen(shippingCost).apply(p));


    }
}
