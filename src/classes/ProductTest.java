package classes;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Bottle",12.50);
        var p2 = new Product("Pencil Case",7.23);

        Product.discount = 0.4;

        double finalPrice1 = p1.priceWithDiscount(0);
        double finalPrice2 = p2.priceWithDiscount(0.1);
        
        System.out.println(finalPrice1);
        System.out.println(finalPrice2);
         
    }

}
