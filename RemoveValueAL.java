import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveValueAL {

    public static void main (String [] args)
    {
        ArrayList<String> input= new ArrayList<>();
        input.add("akhilesh");
        input.add("tandle");
        input.add("sonu");
        input.add("modeln");
               // Array.asList("akhilesh","sonu","tandle","modeln");
        System.out.println(RemoveValue(input,"tandle"));

    }

    public static ArrayList<String> RemoveValue(ArrayList<String> a, String value)
    {
         if (a.contains(value))
         {
             a.remove(value);
         }
         else
             System.out.println("Element not found in the List");
         return a;
    }
}
