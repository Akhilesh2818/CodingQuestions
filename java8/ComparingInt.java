package java8;
import java.util.*;

public class ComparingInt {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("akhilesh", "tanlde","souyu","rat","windowts");

        list.sort(Comparator.comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
