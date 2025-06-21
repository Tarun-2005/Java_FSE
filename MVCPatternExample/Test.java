package digitalnurture.MVCPatternExample;

public class Test {
    public static void main(String[] args) {
        Student model= new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.setStudentname("Tarun");  
        controller.setStudentid("12345");
        controller.setStudentGrade("A+");   
        controller.updateView();    
        controller.setStudentname("Bhuvaneshwaran");        
        controller.setStudentid("67890");
        controller.setStudentGrade("B+");
        controller.updateView();
    
    }
    
}
