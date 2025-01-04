package lambdas;

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = (x, y) -> x + y;
        System.out.println(calc.execute(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc.execute(2, 3));

        System.out.println(calc.cool());
        System.out.println(Calc.cooler());
    }
}
