package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierLambda {
    public static void main(String[] args) {

        Supplier<List<String>> listSupplier = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");    
        
        listSupplier.get().forEach(System.out::println);    
        System.out.println(listSupplier.get()); 
    }
}
