package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        Stream<Integer> obj= Stream.of(1,2,3);
        Stream<Integer> obj1= Stream.of(4,5,6);
        Stream.concat(obj,obj1).forEach(System.out::println);
    }
}
