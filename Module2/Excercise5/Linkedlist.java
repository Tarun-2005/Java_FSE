package Module2.Excercise5;

import java.util.Currency;

public class Linkedlist {
    Node head=null;
    public void add(Task data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;

        }
    
        
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete(int TaskId){
        Node Prev=head;
        Node current=head.next;
        if(Prev.data.TaskId==TaskId){
            head=head.next;
            return;
        }
        for(int i=1;i<TaskId;i++){
            Prev.next=current.next;
            current=current.next;
           
        }

    }
    public void search(int id){
        Node temp=head;
        while(temp!=null){
            if(temp.data.TaskId== id){
                System.out.println("Task found: " + temp.data);
                break;
            }
        }
    
}
}
