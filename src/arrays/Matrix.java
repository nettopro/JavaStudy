package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students? ");
        int studentAmount = input.nextInt();

        System.out.println("How many grades per student? ");
        int gradeAmount = input.nextInt();

        double[][] classGrade = new double [studentAmount][gradeAmount];

        double total = 0;
        for (int i = 0;i < classGrade.length;i++){
            for (int j = 0;j < classGrade[i].length;j++){
                System.out.printf("Insert grade %d of student %d: ",i, j);
                classGrade[i][j] = input.nextDouble();
                total += classGrade[i][j];
            }
        }

        double average = total/(studentAmount*gradeAmount);
        System.out.printf("Average of class is %.2f%n",average);

        for(double[] studentGrade : classGrade){
            System.out.println(Arrays.toString(studentGrade));
        }

        input.close();
            
    }
}
