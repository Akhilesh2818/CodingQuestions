package CodingQuestion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {
    public static void main(String[] args) {
        int [] arr={2,5,2,3,5,7,3,3,2,3,3};
        Map<Integer,Integer> result=new HashMap<>();
        for(Integer n:arr)
        {
            result.put(n,result.getOrDefault(n,0)+1);
        }
        for (int i=0;i<arr.length;i++) {
            arr[i] = result.get(arr[i]);

        }
        Arrays.stream(arr).forEach(System.out::println);
        //System.out.println(Arrays.stream(arr));
    }
}
