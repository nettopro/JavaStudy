package generics;

import java.util.Arrays;
import java.util.List;

public class UsefulListTest {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String lastLang1 = (String) UsefulList.getLast1(langs);
        System.out.println(lastLang1);

        Integer lastNumber1 = (Integer) UsefulList.getLast1(nums);
        System.out.println(lastNumber1);

        String lastLang2 = UsefulList.getLast2(langs);
        System.out.println(lastLang2);

        Integer lastNumber2 = UsefulList.getLast2(nums);
        System.out.println(lastNumber2);
    }
}
