import java.util.*;
import java.util.stream.Collectors;

public class StartingWithOneInt {
    public static void main(String [] args)
    {
        List<Integer> list=Arrays.asList(10,8,4,12,31,16,54,31,11,16,1111);
       // System.out.println(list.stream().filter(x ->x/10==1).collect(Collectors.toList()));
        list.stream().map(x->""+x).filter(x->x.startsWith("1")).mapToInt(x-> Integer.parseInt(x)).forEach(System.out::println);

      //  list.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(System.out::println);

        list.stream().filter(x -> {

                    while (x >= 10) {
                        x /= 10;

                    }
            return x == 1;
                }
        ).forEach(System.out::println);

    }
}
