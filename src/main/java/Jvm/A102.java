package Jvm;

import java.util.*;
import java.util.stream.Collectors;

class student1
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
        student1 s1 = new student1();
        s1.setName("abhishek");
        s1.setSection("A");

        student1 s2 = new student1();
        s2.setName("abhishek");
        s2.setSection("B");

        student1 s3 = new student1();
        s3.setName("abhinav");
        s3.setSection("A");

        List<student1> l1 = new ArrayList<>();
        l1.add(s1);
        l1.add(s2);
        l1.add(s3);
        Map<String,String> m = new HashMap<>();

 Map<String,String> l2 =  l1.stream().filter(e->e.getName().equals("abhishek")).collect(Collectors.toMap(student1::getName, student1::getSection));
        System.out.println(l2);
    }
}
