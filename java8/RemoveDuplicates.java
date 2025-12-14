package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> obj= Arrays.asList(1, 2, 3, 4, 4, 5, 8, 8, 9);

        obj.stream().collect(Collectors.toSet()).forEach(System.out::print);
    }
}
