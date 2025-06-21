package digitalnurture.dependencyInjectionexample;
public interface CustomerRepository{
    Customer findCustomerById(int id);
}