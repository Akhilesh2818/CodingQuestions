package CodingQuestion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortMapByValues {
    public static void main(String [] args)
    {
        Map<Integer,String> ref=new HashMap<>();
        ref.put(1,"Akhilesh");
        ref.put(2,"Sonu");
        ref.put(5,"Badri");
        ref.put(3,"vineeth");
        ref.put(4,"Rahul");

        System.out.println(ref);
        //Collections.sort(ref);
        List<Map.Entry<Integer, String>> collect = ref.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        System.out.println(collect);
        LinkedHashMap<Integer, String> sortedMap = ref.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // ascending
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new // maintain insertion order
                ));
        System.out.println(sortedMap);
    }
}
