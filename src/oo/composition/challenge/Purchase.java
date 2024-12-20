package oo.composition.challenge;

import java.util.ArrayList;

public class Purchase {
    ArrayList<Item> items = new ArrayList<>();

    void addItem(Item item){
        items.add(item);
    }
}
