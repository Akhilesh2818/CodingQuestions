package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {
    public static void main(String[] args) {
        List<String> obj= Arrays.asList("java","python","GO","C++","javascript");

        Map<Boolean,List<String>> obj1= obj.stream().collect(Collectors.partitioningBy(
                s->s.length()>3));
        System.out.println(obj1.get(true));
    }
}
