package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachChar {
    public static void main(String[] args) {
        String str="java";

        Map<String,Long> result = Arrays.stream(str.split("")).
                collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting())
        );
        System.out.println(result);
    }
}
