package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SumEven {
    public static void main(String[] args) {
        List<Integer> ref=Arrays.asList(2,4,8,5,6,7,0,3,2,23,14,12);
        int sum=ref.stream().filter(x->x%2==0).reduce(0,Integer::sum);
        System.out.println(sum);



    }
}
