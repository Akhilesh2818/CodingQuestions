package CodeDecode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsOccurence {
    public static void main(String[] args) {

        String ip="welcome to code decode and code decode welcome you";

        String [] ch=ip.split(" ");

        Map<String,Long> result=Arrays.stream(ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result);


    }
}
