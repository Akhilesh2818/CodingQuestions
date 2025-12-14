package chatgptcoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    String department;
    String name;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    int salary;

    public Employee(String department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> list= Arrays.asList(
                new Employee("HR","Akhilesh",10000),
                new Employee("IT","Naveen",10000),
                new Employee("HR","Ritvik",30000),
                new Employee("IT","Rahul",40000),
                new Employee("Admin","paul",50000),
                new Employee("IT","Test",80000),
                new Employee("Admin","foo",34000)
        );

        Map<String, Double> collect = list.stream().
                collect(Collectors.groupingBy(e -> e.department, Collectors.averagingDouble(e -> e.salary)));

            for (Map.Entry<String,Double> ref: collect.entrySet())
            {
                System.out.println(ref.getKey() +": "+ref.getValue());
            }

        List<Employee> collect1 = list.stream().sorted((o1, o2) -> o2.salary - o1.salary).collect(Collectors.toList());
        List<Employee> sorted = list.stream().sorted(Comparator.comparingInt(Employee::getSalary).
                thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sorted);
       
    }
}
