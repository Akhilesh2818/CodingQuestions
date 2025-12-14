package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SplitCharcString {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("java","ravi");

         li.stream().flatMapToInt(String::chars).mapToObj(c->(char)c).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
