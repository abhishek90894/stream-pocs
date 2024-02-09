package Jvm;

class Employee1
{
   int id;
   String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


public class A149 {

    public static void main(String[] args) {

          Employee1 employee1 = new Employee1(1,"abhishek");
          Employee1 employee2 = new Employee1(1,"abhishek");
        System.out.println(employee1==employee2);
        System.out.println(employee1.equals(employee2));
    }
}
