package foundations;

import java.util.Scanner;

public class ConvertionChallenge{                                                          
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        double sum = 0;
        double[] salary = new double[3];
        while(cont<3){
            cont++;
            System.out.printf("Insert your %d salary: ",cont);
            salary[cont-1] = Double.parseDouble(input.nextLine().replace(",",".")); 
            sum += salary[cont-1];
        }
        input.close();
        double average = sum/salary.length;

        System.out.printf("The average of your three salaries is %.2f",average);

    }
}