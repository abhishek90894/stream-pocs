package Jvm;

import java.util.*;
import java.util.stream.Collectors;

class Student
{
    String name;
    String section;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
public class A102 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("abhishek");
        s1.setSection("A");

        Student s2 = new Student();
        s2.setName("abhishek");
        s2.setSection("B");

        Student s3 = new Student();
        s3.setName("abhinav");
        s3.setSection("A");

        List<Student> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        Map<String,String> m = new HashMap<>();

 Map<String,String> l2 =  l1.stream().filter(e->e.getName().equals("abhishek")).collect(Collectors.toMap(Student::getName,Student::getSection));
        System.out.println(l2);
    }
}
