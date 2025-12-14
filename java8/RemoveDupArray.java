package java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDupArray {
    public static void main(String[] args) {
        int obj[]={2,2,4,5,6,7};

       Arrays.stream(obj).distinct().forEach(System.out::println);
    }
}
