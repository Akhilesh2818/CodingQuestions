import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class CollectionTestList {
    public static void main(String[] args) {
        List<Integer> obj =new ArrayList<>(13);
        obj.add(1);
        System.out.println(obj);
        int i = obj.indexOf(1);
        System.out.println(i);

        Vector<Integer> obj1=new Vector<>();
        obj1.add(1);
        System.out.println(obj1
        );
        Stack<Integer> obj2=new Stack<>();
        obj2.push(1);
        obj2.push(3);
        obj2.push(4);
        System.out.println(obj2);
        obj2.pop();
        Integer peek = obj2.peek();

        System.out.println(peek);
        obj2.set(0,5);
        System.out.println(obj2
        );


    }
}
