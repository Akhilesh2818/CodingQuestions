import java.util.HashMap;
import java.util.Map;

public class DupCharacterCount {
    public static void main(String [] args)
    {
        String str="manojpandey";
        char []ar=str.toCharArray();
        Map<Character,Integer> obj=new HashMap<>();
        for (char ch:ar)
        {
            obj.put(ch,obj.getOrDefault(ch,0)+1);
            if(obj.containsKey(ch) && obj.get(ch)>1)
            {
                System.out.println(ch +": " +obj.get(ch));
            }

        }
    }
}
