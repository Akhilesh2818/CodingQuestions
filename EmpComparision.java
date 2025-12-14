import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpComparision extends Emp{

    public EmpComparision(int id, String name, int marks) {
        super(id, name, marks);
    }

    public static void main(String[] args) {
        Emp e1=new Emp(1,"bkhilesh",34);
        Emp e2=new Emp(1,"aonu",90);
        Emp e3=new Emp(4,"harshitha",43);
        Emp e4=new Emp(7,"rahul",23);

        ArrayList<Emp> obj=new ArrayList<>();
        obj.add(e1);
        obj.add(e2);
        obj.add(e3);
        obj.add(e4);

        /*Collections.sort(obj,
                (com,comp1)-> {
          if(com.getId()== comp1.getId())
          {
             return com.getName().compareTo(comp1.getName());
          }
          return com.getId() - comp1.getId();
        });*/
        Collections.sort(obj, Comparator.comparing(Emp::getId).thenComparing(emp -> emp.getName()));
        System.out.println(obj);
    }
}
