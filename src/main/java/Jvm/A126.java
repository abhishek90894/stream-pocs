package Jvm;

import java.util.*;

class student implements Comparable
{
    int sid;
    String sname;
    String email;
    student(int sid, String sname, String email)
    {
        this.sid=sid;
        this.sname = sname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (Jvm.student) o;
        return sid == student.sid && Objects.equals(sname, student.sname) && Objects.equals(email, student.email);
    }



    @Override
    public int compareTo(Object o) {
        student s = (student)o;
        return this.sid-s.sid;
    }
}

class SnameComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {

        student s1 = (student)o1;
        student s2 = (student)o2;

        return s1.sname.compareTo(s2.sname);
    }
}
class EmailComparator implements Comparator
{

    @Override
    public int compare(Object o1, Object o2) {
        student s1 = (student)o1;
        student s2 = (student)o2;

        return s1.email.compareTo(s2.email
        );
    }
}
public class A126 {

    public static void main(String []arg)
    {
        student s1 = new student(44,"dd","cc@jtc");
        student s2 = new student(22,"aa","bb@jtc");

        List<student>l1 = Arrays.asList(s1,s2);
        Collections.sort(l1,new SnameComparator());
        System.out.println(l1);

    }
}
