package oo.composition;

public class Car {

    Engine engine = new Engine();

    void accelerate(){
        if(engine.pumpFactor<2.6){
            engine.pumpFactor += 0.4;
        }
        
    }

    void brake(){
        if(engine.pumpFactor> 0.5){
            engine.pumpFactor -= 0.4;
        }
        
    }

    void start(){
        engine.on = true;
    }

    void shutdown(){
       engine.on = true; 
    }

    boolean isOn(){
        return engine.on;
    }
}
