package Question240;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> obj=new ArrayList<>();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        Iterator<Integer> iterator=  obj.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
