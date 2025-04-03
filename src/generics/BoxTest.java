package generics;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> boxA = new Box<>();

        boxA.stash("Secret!");
        
        System.out.println(boxA.open());

        Box<Double> boxB = new Box<>();

        boxB.stash(2.45);
        
        System.out.println(boxB.open());
    }
}
