package exceptions.customizedA;

public class EmptyStringException extends RuntimeException{
    private String attributeName;

    public EmptyStringException(String attributeName){
        this.attributeName = attributeName;
    }

    public String getMessage() {
        return String.format("Attribute %s is empty.", attributeName);
    }
}
