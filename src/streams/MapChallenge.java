package streams;

import java.util.Arrays;
import java.util.List;

public class MapChallenge {
    public static void main(String[] args) {
    
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        nums.stream()
        .map(Integer::toBinaryString)
        .map(binaryStr -> new StringBuilder(binaryStr).reverse().toString())
        .map(n -> Integer.parseInt(n,2))
        .forEach(System.out::println);
    }   
}
