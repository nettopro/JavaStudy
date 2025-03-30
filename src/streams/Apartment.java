package streams;

public class Apartment {
    final String typeOfApartment;
    final double rentValue;
    
    public Apartment(String typeOfApartment, double rentValue) {
        this.typeOfApartment = typeOfApartment;
        this.rentValue = rentValue;
    }

    public String getTypeOfApartment() {
        return typeOfApartment;
    }

    public double getRentValue() {
        return rentValue;
    }

    
}
