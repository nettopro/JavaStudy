package foundations;

public class ArithmeticOpsChallenge {
    public static void main(String[] args) {
        int part1 = (int) Math.pow(6 * (3 + 2),2);
        int part2 = 3 * 2;
        int part3 = (1-5)*(2-7);
        int part4 = 2;

        double aggregate1 = part1/part2;

        double aggregate2 = Math.pow(part3/part4,2);


        double numerator = Math.pow(aggregate1 - aggregate2,3);

        double equation = numerator/Math.pow(10,3);

        System.out.println(equation);
    }
}
