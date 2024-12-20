package foundations;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String test = "hello!!!";
        System.out.println(test.charAt(5));
        System.out.println(test.toUpperCase());

        Scanner input = new Scanner(System.in);
        System.out.println("type: ");
        String name = input.nextLine();
        System.out.println(name);
        int age = input.nextInt();
        System.out.println(age);
        input.close();
        
    }
}
