package Module2.Excercise4;

public class Test {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add(new Employee(1, "Tarun", "Software Engineer",60000));
        employeeManager.add(new Employee(2, "Ravi", "Project Manager",80000));
        employeeManager.add(new Employee(3, "Sita", "HR Manager",70000));
        employeeManager.add(new Employee(4, "Anita", "Data Scientist",90000));
        employeeManager.display();
        employeeManager.search(2);
        employeeManager.delete(3);  
        System.out.println("After deletion:");
        employeeManager.display();        
    }
    }
    

