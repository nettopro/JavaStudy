package foundations;

public class BreakExercise {
    public static void main(String[] args) {
        external : for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if (i == 1){
                    break external;
                }
                System.out.printf("[%d %d]", i, j);
            }
            
        }
    }
}
