package Module1.dependencyInjectionexample;

public class Customer {
    private int id;
    private String name;
    private String email;
    public Customer(int id,String name,String emaail){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public String toString(){
        return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
    }   
}
