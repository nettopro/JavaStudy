package oo.composition.challenge;

import java.util.ArrayList;

public class Buyer {
    String name;
    ArrayList<Purchase> shoppingCart = new ArrayList<>();

    public Buyer(String name) {
        this.name = name;
    }
    void addPurchase(Purchase purchase){
        shoppingCart.add(purchase);
    }
    void getTotalValue(){
        double total = 0;

        for(Purchase purchase : shoppingCart){
            for(Item item : purchase.items){
                total += item.product.price*item.quantity;
            }
        }

        System.out.printf("%s's Total value is : %.2f%n",name, total);
    }
}
