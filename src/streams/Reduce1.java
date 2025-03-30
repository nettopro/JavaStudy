package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> sum = (ac,n) -> ac + n;

        Integer total1 = nums.parallelStream()
            .reduce(sum).get();
        System.out.println(total1); //Can return a null value and if a primitive int is assigned it will give an error.

        Integer total2 = nums.stream().reduce(100,sum);
        System.out.println(total2);

        //Result was an Optional<Integer>
        nums.stream()  
            .filter(n -> n > 5)
            .reduce(sum)
            .ifPresent(System.out::println);
    }
}
