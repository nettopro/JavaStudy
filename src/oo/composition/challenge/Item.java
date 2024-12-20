package oo.composition.challenge;

public class Item {
    Product product;
    int quantity;

    public Item(int quantity,Product product) {
        this.product = product;
        this.quantity = quantity;
    }
}
