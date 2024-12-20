package oo.inheritance.challenge;

public class FordFocus extends Car{

    public FordFocus(){
        this((short) 180,(short) 15);
    }

    public FordFocus(short maxSpeed,short acceleration){
        super(maxSpeed,acceleration);
    }
    
}
