package springBootDemo.demo;

public class employee {

    private int empId;
    private String empName;
    private int salary;

    public employee(int empId, String empName, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}


