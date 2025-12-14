package java8;

import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 1, 4, 8, 6);

       int secondMax= numbers.stream().sorted((a, b)->b-a).skip(1).findFirst().get();
        System.out.println(secondMax);
    }

}
