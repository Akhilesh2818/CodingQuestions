package CodingQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

public class Compex {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(101, "Akhil", "IT", 70000));
        list.add(new Employee(102, "Ravi", "Finance", 60000));
        list.add(new Employee(103, "Neha", "IT", 85000));
        list.add(new Employee(104, "Suresh", "HR", 50000));
        list.add(new Employee(105, "Meena", "Finance", 80000));
        list.add(new Employee(106, "Anjali", "Finance", 80000));
        list.add(new Employee(107, "Rohit", "IT", 85000));
        list.add(new Employee(108, "Kiran", "HR", 60000));


        list.sort(Comparator
                .comparing(Employee::getDepartment)
                .thenComparing(Comparator.comparing(Employee::getSalary).reversed())
                .thenComparing(Employee::getName));
        System.out.println( list);
    }
}
