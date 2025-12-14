package java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfList {

    public static void main(String [] args)
    {
        List<Integer> obj= Arrays.asList(1,2,3,4,5);


        int num=obj.stream().reduce(0,Integer::max //sum
        );
        System.out.println(num);

    }
}
