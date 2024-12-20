package oo.composition.challenge;

public class Store {
    public static void main(String[] args) {
        Product p1 = new Product("Basketball",40.8);
        Product p2 = new Product("Baseball Bat",124);
        Product p3 = new Product("Toy Car",12);

        Item i1 = new Item(4,p1);
        Item i2 = new Item(2,p2);
        Item i3 = new Item(8,p3);

        Purchase b1 = new Purchase();
        b1.addItem(i1);
        b1.addItem(i2);

        Purchase b2 = new Purchase();
        b2.addItem(i1);
        b2.addItem(i3);

        Buyer buyer1 = new Buyer("John");
        buyer1.addPurchase(b1);
        buyer1.addPurchase(b2);

        buyer1.getTotalValue();

        Buyer buyer2 = new Buyer("Douglas");
        buyer2.addPurchase(b2);

        buyer2.getTotalValue();
    }
}
