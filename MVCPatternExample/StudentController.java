package digitalnurture.MVCPatternExample;

public class StudentController {
        private StudentView view;
        private Student model;
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentname(String name){
        model.setName(name);
}
    public String getStudentname(){
        return model.getName();
    }
    public void setStudentid(String id){
        model.setid(id);
    }
    public String getStudentid(){
        return model.getid();
    }
    public void setStudentGrade(String Grade){
        model.setGrade(Grade);
    }
    public String getStudentGrade(){
        return model.getGrade();
    }
    public void updateView(){
        view.PrintDetails(model.getName(),model.getid(),model.getGrade());
    }
}
