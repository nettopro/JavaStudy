package lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorLambda {
    public static void main(String[] args) {
        
        UnaryOperator<Integer> plusTwo = v -> v + 2;    
        UnaryOperator<Integer> timesTwo = v -> v * 2;
        UnaryOperator<Integer> squared = v -> v * v;

        //Compose is the opposite of andThen (order of execution)

        System.out.println(plusTwo.andThen(timesTwo).andThen(squared).apply(0));
        System.out.println(squared.compose(timesTwo).compose(plusTwo).apply(0));    
    }
}
