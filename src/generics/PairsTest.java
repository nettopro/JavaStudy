package generics;

public class PairsTest {
    public static void main(String[] args) {
        
        Pairs<Integer,String> contestResult = new Pairs<>();

        contestResult.add(1,"Mary");
        contestResult.add(2,"Anna");
        contestResult.add(3,"Gabe");
        contestResult.add(4,"John");
        contestResult.add(2,"Becca");

        System.out.println(contestResult.getValue(1));
        System.out.println(contestResult.getValue(3));
        System.out.println(contestResult.getValue(2));

    }
}
