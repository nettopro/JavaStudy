package oo.composition;

import java.util.ArrayList;

public class Purchase {

    String buyer;
    ArrayList<Item> items = new ArrayList <>();

    double getTotalValue(){
        double total = 0;

        for(Item item : items){
            total += item.quantity * item.price;
        }

        return total;
    }
}
