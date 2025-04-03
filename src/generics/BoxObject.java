package generics;

public class BoxObject {
    
    private Object thing;
    
    public void stash(Object thing){
        this.thing = thing;
    }

    public Object open(){
        return thing;
    }
}
