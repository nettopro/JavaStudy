package classes;

public class Equals {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "John Doe";
        u1.email = "johndoe@outlook.com";

        User u2 = new User();
        u2.name = "John Doe";
        u2.email = "johndoe@outlook.com";

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(new Product())); //Testing error handling by equaling to another product

    }
}
