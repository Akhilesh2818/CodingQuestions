package CodingQuestion;


import java.util.*;

public class Comparator1 {


    public static void main(String[] args) {

        List<Order> list1 = Arrays.asList(
                new Order("Akhilesh", 1),
                new Order("vaib", 3),
                new Order("harshitha", 4),
                new Order("bhagyalaxmi", 5),
                new Order("lAXMI", 6)

        );

        Set<Order> set= new LinkedHashSet<>(
        );
        set.add(new Order("veer",1));
        set.add(new Order("rishi",3));
        set.add(new Order("riktivk",2));
        set.add(new Order("sai",4));
        set.add(new Order("pocham",5));
        System.out.println(set);

       // Collections.sort(list1,new CustomSorting());
        System.out.println(list1);

    }
}
