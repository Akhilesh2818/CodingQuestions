package java8;

import java.util.stream.Collectors;

public class FindFirstRepeatedChar {

    public static void main(String [] args)
    {
        String s="Java is a programming language";
        Character key =s.chars().mapToObj(ch->(char)ch).filter(ch-> ch!=' ')
                .collect(Collectors.groupingBy(n->n,Collectors.counting())).entrySet().stream().
                filter(entry ->entry.getValue()>1).findFirst().get().getKey();

        System.out.println(key);
    }
}
