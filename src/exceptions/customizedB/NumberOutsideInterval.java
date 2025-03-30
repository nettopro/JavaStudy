package exceptions.customizedB;

public class NumberOutsideInterval extends Exception{

    private String attributeName;

    public NumberOutsideInterval(String attributeName){
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("Attribute %s is outside interval.", attributeName);
    }
}

