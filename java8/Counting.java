package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Counting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));
        System.out.println(namesCount);
    }
}
