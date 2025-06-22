package Module2.Excercise4;

public class EmployeeManager {
    public Employee[] employees = new Employee[10];
    public int size = 0;
    public void add(Employee employ){
        if(size<employees.length){
            employees[size]=employ;
            size++;
            
        }
        else{
            System.out.println("Employee list is full, cannot add more employees.");
        }
    }
    public void display(){
        if(size==0){
            System.out.println("No employees to display.");
            return ;
        }
        for(int i=0;i<size;i++){
            System.out.println(employees[i]);
        }
    }
    public void search(int Empid)
    {
        for(int i =0;i<=size;i++){
            if(employees[i].empId==Empid){
                System.out.println("Employee found: " + employees[i]);
                return;
            }
            else{
                System.out.println("Employee not found with ID: " + Empid);
            }
        }
    }
    public void delete(int Empid){
        for(int i=0;i<size;i++){
            if(employees[i].empId==Empid){
                for(int j=i;j<size;j++){
                    employees[j]=employees[j+1];
                }
                size--;
                System.out.println("Employee with ID " + Empid + " has been deleted.");
            }
        }
    }
}
