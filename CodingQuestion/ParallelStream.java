package CodingQuestion;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        names.parallelStream().forEach(System.out::print
        );
        names.stream().forEach(System.out::println
        );
    }
}
