package oo.encapsulation;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("John","Doe",230);
        p1.setAge(-30); //Gets converted to Absolute value in the set method

        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1);
        System.out.println(p1.getFullName());
    }
}
