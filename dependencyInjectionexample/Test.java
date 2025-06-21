package digitalnurture.dependencyInjectionexample;

public class Test {
    public static void main(String[] args) {
        CustomerRepository repository=new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);
        service.getCustomerDetails(1); 
        service.getCustomerDetails(2); 
        
    }
    
}
