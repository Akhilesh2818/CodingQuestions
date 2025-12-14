import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        containsDuplicate(arr);
    }
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> obj= new HashMap<>();
        for(Integer n:nums)
        {
            obj.put(n,obj.getOrDefault(n,0)+1);
        }
        System.out.println(obj);
        for(Integer i:obj.values())
        {
            if(i>1){
                return true;
            }
        }
        return false;
    }
}
