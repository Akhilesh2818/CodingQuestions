import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupList {
    public static void main (String [] args)
    {
        List<Integer> dupl=new ArrayList<>();
        dupl.add(1);
        dupl.add(2);
        dupl.add(3);
        dupl.add(2);
        dupl.add(4);

        System.out.println(RemoveDuplicates((ArrayList<Integer>) dupl));
    }

    public static HashSet<Integer> RemoveDuplicates(ArrayList<Integer> obj)
    {
         HashSet<Integer> removeDup =new HashSet<>(obj);
        return removeDup;
    }
}
