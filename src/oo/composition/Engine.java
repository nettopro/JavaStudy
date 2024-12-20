package oo.composition;

public class Engine {

    boolean on = false;
    double pumpFactor = 1;
    
    int rpm(){
        if(!on){
            return 0;
        }
        else{
            return (int) pumpFactor * 3000;
        }
    }

}
