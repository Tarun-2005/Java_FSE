package Module2.Excercise4;

public class Employee {
    public int empId;
    public String empName;
    public String position;
    public double salary;
    public Employee(int empId, String empName, String position, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.position = position;
        this.salary = salary;
    }
    public String toString(){
        return "Employee Details: Empid:"+empId+
                ", EmpName:"+empName+
                ", Position:"+position+
                ", Salary:"+salary;
    }
    
}
