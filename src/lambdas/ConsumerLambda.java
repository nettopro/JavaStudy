package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {

    public static void main(String[] args) {

        Consumer<Product> print = p -> System.out.println(p.name + " costs " + p.price);
        
        Product p1 = new Product("Pen", 12.34, 0.09);
        print.accept(p1);

        List<Product> products = Arrays.asList(
            new Product("Pen", 12.34, 0.09),
            new Product("Laptop", 2987.99, 0.25),
            new Product("Book", 19.90, 0.03),
            new Product("Pencil", 7.80, 0.18),
            new Product("Smartphone", 1999.89, 0.12)
        );

        products.forEach(print);
        products.forEach(p -> System.out.println(p.price));
        products.forEach(System.out::println);
    }
}
