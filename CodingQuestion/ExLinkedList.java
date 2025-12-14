package CodingQuestion;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ExLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> obj=new LinkedList<>();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(1);
        obj.addLast(6);
        obj.addFirst(3);
        System.out.println(obj);
        List<Integer> result= obj.stream().
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
        //REverse a linkedlist

    }
}
