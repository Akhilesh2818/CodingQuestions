import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddNumberCount
{
    public static void main(String[] args) {

        List<Integer> elements=Arrays.asList(1,3,5,3,5,7,8,4);
        System.out.println(oddNumber(elements));
    }

    public  static Map<Integer,Long> oddNumber(List<Integer> obj)
    {
        List<Integer> odd =obj.stream().filter(e ->e%2!=0).collect(Collectors.toList());

        return odd.stream().collect(Collectors.groupingBy((e1->e1),Collectors.counting()));

    }
}
