package Module1.dependencyInjectionexample;

public class CustomerRepositoryImpl implements CustomerRepository{
    public Customer findCustomerById(int id) {

        if (id == 1) {
            return new Customer(1, "SteveSmith", "stevesmith@gmail.com");

}else{
    return null;
}
    }
}