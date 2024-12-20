package classes;

public class VariableOutsideMainChallenge {
    
    int a = 3;
    
    static int b = 4;

    public static void main(String[] args) {
        VariableOutsideMainChallenge v = new VariableOutsideMainChallenge();    
        System.out.println(v.a);

        System.out.println(b);
    }
}
