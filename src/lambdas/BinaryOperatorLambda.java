package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorLambda {
    public static void main(String[] args) {
        
        BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
        System.out.println(average.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Approved" : "Flunked";
        System.out.println(result.apply(9.7, 5.1));
        System.out.println(result.apply(6.7, 6.1));

        Function<Double, String> approved = n -> n >= 7 ? "Approved" : "Flunked";

        System.out.println(average.andThen(approved).apply(9.7, 5.1));
    }
}
