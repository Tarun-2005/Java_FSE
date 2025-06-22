package Module2.Excercise5;

public class Task {
    int TaskId;
    String TaskName;
    String status;

    public Task(int TaskId, String TaskName, String status) {
        this.TaskId=TaskId;
        this.TaskName=TaskName; 
        this.status=status;
    }
    public String toString(){
        return "Task:   TaskId=" + TaskId + ", TaskName=" + TaskName + ", status=" + status ;
    }
    
    
}
