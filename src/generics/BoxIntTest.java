package generics;

public class BoxIntTest {
    public static void main(String[] args) {
        BoxInt boxA = new BoxInt();
        boxA.stash(2);

        System.out.println(boxA.open());
    }
}
