package classes;

public class ValueVsReference {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //Value Attribution (Values aren't connected as they are not sharing the same memory space)  
        //Applied to primitive values

        a++;
        b--;

        System.out.println(a + " " + b);

        Product d1 = new Product("Pencil",2.5);
        Product d2 = d1; //Reference Attribution (Values are connected as they share the same memory space)
        //Applied to Objects

        d1.name = "Pen";
        d2.price = 5;

        System.out.println(d1.price + " " + d1.name);
        System.out.println(d2.price + " " + d2.name);

        defineDefaultProduct(d1); //Not a good practice

        System.out.println(d1.price + " " + d1.name);
        System.out.println(d2.price + " " + d2.name);

        int c = 5;
        alterPrimitive(c);
        System.out.println(c);

    }

    static void defineDefaultProduct(Product p){
        p.name = "Produto";
        p.price = 15;
    }

    static void alterPrimitive(int a){
        a++;
    }
}
