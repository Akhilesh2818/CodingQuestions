import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableEx implements Comparator<Emp> {
    public static void main(String[] args) {

        ComparableEx REF=new ComparableEx() ;
        Emp obj =new Emp(1,"Akhilesh",100);
        Emp obj1 =new Emp(2,"zahul",110);
        Emp obj3 =new Emp(3,"Vasanth",140);
        Emp obj4 =new Emp(4,"sarang",180);

        List<Emp> list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);

        list.add(obj3);
        list.add(obj4);

        Collections.sort(list, REF);

        list.forEach(e -> System.out.println(e.getId() + " " + e.getName() + " " + e.getMarks()));


    }


    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
