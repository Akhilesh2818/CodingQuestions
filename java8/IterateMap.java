package java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMap {
    public static void main(String [] args)
    {
            Map<String,String> value=new HashMap<>();
            value.put("akhilesh","sonu");
            value.put("vaibhavi","sonali");
        iterateHashMap(value);
    }
    public  static void iterateHashMap(Map<String,String> map)
    {
        for (Map.Entry<String, String> obj:map.entrySet())
        {
            System.out.println(obj.getKey()+" Value: "+obj.getValue());
        }

        Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String,String> entry=itr.next();
            System.out.println(entry.getKey()+ " value is : "+entry.getValue());
        }
    }
}
