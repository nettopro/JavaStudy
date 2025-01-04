package lambdas;

import java.util.function.BinaryOperator;

public class CalcTest2 {
    public static void main(String[] args) {

        // Java doesnt allow int -> Double (primitive int to object Double)
        // It allows double -> Double (primitive double to object Double)

        BinaryOperator<Double> calc = (x, y) -> x + y;
        System.out.println(calc.apply(2.0, 3.0));

        calc = (x, y) -> x * y;
        System.out.println(calc.apply(2.0, 3.0));

        BinaryOperator<Integer> calc2 = (x, y) -> x + y;
        System.out.println(calc2.apply(2, 3));

        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(2, 3));
    }
}
