package java8;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FindStringStartWith {
    public static void main(String[] args) {
        String s="apple banana mango box been fox auto bike";

       /* String [] arr=s.split(" ");
       for (String value : arr)
       {
            if (value.charAt(0)=='b'){
                System.out.println(value);
            }
       }*/
      Arrays.stream(s.split(" ")).filter(s1->s1.startsWith(String.valueOf('b'))).limit(1).collect(Collectors.toList()).forEach(res-> System.out.println(res));

    }

}
