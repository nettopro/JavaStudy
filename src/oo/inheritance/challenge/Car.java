package oo.inheritance.challenge;

public class Car {
    short currentSpeed,acceleration;
    final short MAX_SPEED;

    protected Car(short maxSpeed, short acceleration){
        this.MAX_SPEED = maxSpeed;
        this.acceleration = acceleration;
    }


    public short accelerate(){
        if(currentSpeed < MAX_SPEED){
            return currentSpeed += acceleration;
        }
        return 0;
    }

    public short brake(){
        if(currentSpeed > acceleration){
            return currentSpeed -= acceleration;
        }
        return 0;
    }
}
