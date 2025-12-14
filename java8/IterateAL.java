package java8;
import java.util.ArrayList;
import java.util.List;
public class IterateAL {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        iterateAF(list);

    }

    public static void iterateFl(List<Integer> list)
    {
        for (int i=0;i<list.size();i++)
        {

            System.out.println(list.get(i));
        }

    }
    public static  void iterateWl(List<Integer> list)
    {
         int j=0;
        while(j<list.size())
        {
            System.out.println(list.get(j));
            j++;
        }
    }

    public  static  void iterateAF(List<Integer> list)
    {
        for( int value:list)
        {
            System.out.println(value);
        }
    }
}
