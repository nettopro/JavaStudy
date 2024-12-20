package arrays;

import java.util.Arrays;

public class Exercise {
    
    static double calculateAverage(double[] studentGrades){
        double total = 0;

        for (int i = 0 ; i< studentGrades.length;i++){
            total += studentGrades[i];
        }

        return total/studentGrades.length;
    }
    public static void main(String[] args) {
        double[] studentAGrades = new double[3];

        System.out.println(Arrays.toString(studentAGrades));

        studentAGrades[0] = 8;
        studentAGrades[1] = 7.9;
        studentAGrades[2] = 6.7;

        System.out.println(Arrays.toString(studentAGrades));

        System.out.println(studentAGrades[studentAGrades.length-1]); //Get value of last index of array

        double[] studentBGrades = {5.5,6.5,9.2};

        System.out.printf("Average is : %.2f%n",calculateAverage(studentAGrades));
        System.out.printf("Average is : %.2f%n",calculateAverage(studentBGrades));
    }
}
