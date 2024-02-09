package Jvm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employe
{

    String empName;
    String department;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empName='" + empName + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
public class A136 {
                           //List<Emolpyee> list=new ArrayList();
                           //get all employee names that belogs to IT department
    public static void main(String[] args) {

        Employe employe1 = new Employe();
           employe1.setEmpName("abhishek");
           employe1.setDepartment("cs");
           Employe employe2 = new Employe();
           employe2.setEmpName("abhinav");
           employe2.setDepartment("IT");

        List<Employe> l1 = Arrays.asList(employe1,employe2);

     List<Employe> employes    = l1.stream().filter(e->e.getDepartment().equals("IT")).collect(Collectors.toList());
                employes.forEach(e->System.out.println(e.getEmpName()));

    }
}
