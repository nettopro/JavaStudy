package generics;

public class Box<T> {
    private T thing; //Normally the generics are assigned with a single letter, that is the norm
    
    public void stash(T thing){
        this.thing = thing;
    }

    public T open(){
        return thing;
    }
}
