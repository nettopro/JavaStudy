package exceptions.customizedA;

public class NumberOutsideInterval extends RuntimeException{

    private String attributeName;

    public NumberOutsideInterval(String attributeName){
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("Attribute %s is outside interval.", attributeName);
    }
}
