package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    String city;
    String name;

    public Employee(String city, String name) {
        this.city = city;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class A120 {

    public static void main(String[] args) {
  Employee emp1 = new Employee("banglore","abhishek");
  Employee emp2 = new Employee("kanpur","abhinav");
  Employee emp3 = new Employee("gurgaon","tanu");

  List<Employee> l1 = Arrays.asList(emp1,emp2,emp3);
    List<Employee> emp =  l1.stream().filter(e->e.getCity().equals("banglore")).collect(Collectors.toList());
        System.out.println(emp);
    }
}
