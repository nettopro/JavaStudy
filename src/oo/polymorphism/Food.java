package oo.polymorphism;

public abstract class Food {
    protected double weight;

    public Food(double weight){
        setWeight(weight);
    }
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight >= 0 ){
            this.weight = weight;
        }
    }
}
