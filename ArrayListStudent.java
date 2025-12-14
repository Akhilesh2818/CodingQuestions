import java.util.ArrayList;
import java.util.List;

public class ArrayListStudent {
    public static void main(String [] args)
    {
        // Stundet with mumbai as city in an array list
        // update city of the Student with mumbai with hyderbad
        //Return how many stundes vere updated in the list

        List<Student> obj=new ArrayList<>();
        obj.add(new Student("Akhilesh","Mumbai"));
        obj.add(new Student("Ganesh","Mumbai"));
        obj.add(new Student("Abhiram","Benagaluru"));
        obj.add(new Student("Kuldeep","Bangkok"));
        obj.add(new Student("Pocham","Thailand"));
        obj.add(new Student("Vineeth","Pattaya"));

        System.out.println(NumberOfStudents((ArrayList<Student>) obj));

    }
    public  static int NumberOfStudents(ArrayList<Student> obj)
    {   int updatedcount=0;
        for (Student student: obj)
        {
            if (student.city.equals("Mumbai"))
            {
                student.city="Hyderabad";
                updatedcount++;
            }
        }
        return updatedcount;
    }
}

class Student
{
    public String name;
    public String city;

    Student(String name,String city)
    {
        this.name=name;
        this.city=city;
    }
}
