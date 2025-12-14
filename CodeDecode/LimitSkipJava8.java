package CodeDecode;

import java.util.Arrays;
import java.util.List;

public class LimitSkipJava8 {

    public static void main(String[] args) {
        List<Integer> obj= Arrays.asList(123, 456, 789,1,2,3,4);

        obj.stream().limit(4).forEach(System.out::println);
        obj.stream().skip(4).forEach(System.out::println);
    }
}
