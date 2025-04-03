package generics;

public class BoxNumberTest {
    public static void main(String[] args) {
        BoxNumber<Double> boxA = new BoxNumber<>();  //Cant declare anything other than numbers because we have limited the inherited class to Number
        boxA.stash(2.3);
        System.out.println(boxA.open());
        BoxNumber<Integer> boxB = new BoxNumber<>();  //Cant declare anything other than numbers because we have limited the inherited class to Number
        boxB.stash(2);
        System.out.println(boxB.open());
    }
}
