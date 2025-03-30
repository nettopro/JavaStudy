package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterChallenge {
    public static void main(String[] args) {
        
        Apartment ap1 = new Apartment("VIP+", 300);
        Apartment ap2 = new Apartment("Basic", 100);
        Apartment ap3 = new Apartment("Basic", 500);
        Apartment ap4 = new Apartment("VIP Ultra", 750);
        Apartment ap5 = new Apartment("VIP", 450);
        Apartment ap6 = new Apartment("VIP++", 320);

        List<Apartment> apartments = Arrays.asList(ap1,ap2,ap3,ap4,ap5,ap6);
        
        Predicate<Apartment> isVIP = ap -> "VIP".equals(ap.getTypeOfApartment().substring(0, 3));

        Predicate<Apartment> mediumHighRent = ap -> ap.getRentValue() >= 310;

        Function<Apartment,String> apartmentInfo = ap -> "Apartment " + ap.getTypeOfApartment() + " of rent value US$" + ap.getRentValue();

        apartments.stream()
            .filter(isVIP)
            .filter(mediumHighRent)
            .map(apartmentInfo)
            .forEach(System.out::println);
    }
}
