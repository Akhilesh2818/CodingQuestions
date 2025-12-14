package Java8Concepts;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String [] args)
    {
        List<Integer> list = Arrays.asList(4,5,6,7,8,9);


        System.out.println( list.stream().peek(System.out::println).allMatch(x->x%2==0));

         //Stream.iterate("", (str) -> str + "x").forEach(System.out::println);
       // System.out.println(st.limit(3).map(str -> str + "y"));

        List<Integer> collect = list.stream().filter(x -> x > 6).collect(Collectors.toList());
        System.out.println(collect
        );



    }
}
