package arrays;

public class ForEach {
    public static void main(String[] args) {
        double[] grades = {2.5,6.6,9.2,2.4,4.8};
        double total = 0;
        
        for(double grade: grades){
            total += grade;
            System.out.println(grade);
        }

        System.out.printf("Average : %.2f",total/grades.length);
    }
}
