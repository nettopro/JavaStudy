package oo.inheritance.challenge;

public class LamborghiniAventador extends Car implements Sports, Luxury{
    
    private boolean turboState;
    private boolean airConState;

    public LamborghiniAventador(){
        this((short) 380,(short) 30);
    }

    public LamborghiniAventador(short maxSpeed,short acceleration){
        super(maxSpeed,acceleration);
    }

    @Override
    public void turboOn(){
        turboState = true;
    }

    @Override
    public void turboOff() {
        turboState = false;
    }

    @Override
    public void airConOn() {
        airConState = true;
    }

    @Override
    public void airConOff() {
        airConState = false;
    }

    public int getAcceleration(){
        if(turboState && !airConState){
            return super.acceleration = 50;
        }
        else if (turboState && airConState){
            return super.acceleration = 40;
        }
        else if (!turboState && !airConState){
            return super.acceleration = 35;
        }
        else{ return super.acceleration = 30;}
    }
}
