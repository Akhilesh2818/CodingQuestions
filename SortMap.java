import java.util.*;

public class SortMap {
    public static void main(String[] args) {

        Map<String,Integer> obj=new HashMap<>();
        obj.put("akhilesh",1);
        obj.put("sonu",4);
        obj.put("harshitha",2);
        obj.put("ritik",3);

        LinkedHashMap<String , Integer> collect = obj.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(LinkedHashMap::new, (m, v) ->

                m.put(v.getKey(), v.getValue()), LinkedHashMap::putAll);

        for(Map.Entry<String,Integer> entry : collect.entrySet())
        {
            System.out.println(entry.getKey() +" " + entry.getValue());
        }

    }
}