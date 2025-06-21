package digitalnurture.dependencyInjectionexample;

public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public void getCustomerDetails(int id){
        Customer customer=customerRepository.findCustomerById(id);
        System.out.println("Customer Details:"+ customer);
    }
}
