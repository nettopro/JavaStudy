package lambdas;

import java.util.function.Function;

public class FunctionLambda {
    public static void main(String[] args) {

        Function<Integer, String> evenOrOdd = 
            number -> number % 2 == 0 ? "Even" : "Odd";

        System.out.println(evenOrOdd.apply(10));
        System.out.println(evenOrOdd.apply(11));

        Function<String, String> theResultIs = 
            value -> "The result is: " + value;

        Function<String, String> excited = 
            value -> value + "!!!";

            Function<String, String> confused = 
            value -> value + "???";

        String finalResult1 = evenOrOdd
            .andThen(theResultIs)
            .andThen(excited)
            .apply(10);

        System.out.println(finalResult1);
        
        String finalResult2 = evenOrOdd
            .andThen(theResultIs)
            .andThen(confused)
            .apply(11);

        System.out.println(finalResult2);
    }
}
