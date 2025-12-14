package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStartingLetter {
    public static void main(String[] args) {
        List<String> obj= Arrays.asList("Akhilesh","sonu","ritvik","amber","australia");

        List<String> result=obj.stream().filter(s->s.toLowerCase().charAt(0)=='a').collect(Collectors.toList());
        System.out.println(result.toString());
    }
}
