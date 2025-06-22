package Module2.Excercise5;

public class Test {
    public static void main(String[] args) {
       Linkedlist list = new Linkedlist();
       list.add (new Task(1, "Task 1", "Pending"));
       list.add (new Task(2, "Task 2", "In Progress"));
        list.add (new Task(3, "Task 3", "Completed"));
         list.display();
        list.delete(1);
        System.out.println("After deletion:");
        list.display();
        list.search(2);
    }
    
}
