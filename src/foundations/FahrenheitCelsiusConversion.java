package foundations;

public class FahrenheitCelsiusConversion {
    static void convertToCelsius(){
        double fahrenheit = 86; 
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
    }
    static void convertToFahrenheit(){
        double celsius = 30;
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
    public static void main(String[] args) {
        convertToCelsius();
        convertToFahrenheit();
    }
}
