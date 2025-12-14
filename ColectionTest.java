import java.util.Stack;

public class ColectionTest {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
       // System.out.println(s);
        //s.pop();
        System.out.println(s.pop());
        s.pop();
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.search(30));
        System.out.println(s1.pop());
    }
}
