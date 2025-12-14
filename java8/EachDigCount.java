package java8;

import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

public class EachDigCount {
    public static void main(String[] args) {
        List<Integer> obj= Arrays.asList(123, 456, 789);
        int result=obj.stream().

                mapToInt(x->String.valueOf(x).chars().map(Character::getNumericValue).sum()).sum();
        System.out.println(result);
    }
}
