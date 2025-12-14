package java8;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String value="akhileshi";
        dupcharacters(value);

    }

    public  static  void dupcharacters(String s)
    {
        char []arr =s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for (Character value:arr)
        {
            map.put(value, map.getOrDefault(value,0)+1);
        }

        for (Map.Entry<Character,Integer> value:map.entrySet())
        {
            if (value.getValue()>1)
            System.out.println(value.getKey()+": appeared :"+value.getValue()+"times");
        }
    }
}
