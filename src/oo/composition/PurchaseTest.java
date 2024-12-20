package oo.composition;

public class PurchaseTest {
    public static void main(String[] args) {
        Purchase c1 = new Purchase();
        c1.buyer = "Douglas";
        c1.items.add(new Item("Pen",20,7.45));
        c1.items.add(new Item("Eraser",12,3.95));
        c1.items.add(new Item("Notebook",4,12.55));

        System.out.println(c1.items.size());
        System.out.printf("Total value of cart : $%.2f", c1.getTotalValue());

    }
}
