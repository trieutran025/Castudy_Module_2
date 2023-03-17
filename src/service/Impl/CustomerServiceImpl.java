package src.service.Impl;

import src.models.Customer;
import src.repository.CustomerRepository;
import src.repository.Impl.CustomerRepositoryImpl;
import src.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository repository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() {
       return repository.findAll();
    }

    @Override
    public void add(Customer customer) {
        repository.add(customer);
    }

    @Override
    public void set(String customerCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address) {
        repository.set( customerCode,  name,  birth,  gender,  identityCard,  numberPhone,  email,  customerType,  address);
    }
}
