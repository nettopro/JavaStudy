package generics;

public class BoxObjectTest {
    public static void main(String[] args) {
        BoxObject boxA = new BoxObject();
        boxA.stash(2.3); // double -> Double

        Double thingA = (Double) boxA.open();
        System.out.println(thingA); 

        BoxObject boxB = new BoxObject();
        boxB.stash("Hi"); 

        String thingB = (String) boxB.open();
        System.out.println(thingB); 
    }
}
