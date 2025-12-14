package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s="aabcdde";
        Optional<Map.Entry<Character, Long>> first = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy
                        (e->e, LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue() == 1).findFirst();
        System.out.println(first);
    }
}
