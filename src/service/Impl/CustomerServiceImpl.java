package src.service.Impl;

import src.models.Customer;
import src.repository.CustomerRepository;
import src.repository.Impl.CustomerRepositoryImpl;
import src.service.CustomerService;

import java.io.IOException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository repository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() throws IOException {
       return repository.findAll();
    }

    @Override
    public void add(Customer customer) throws IOException {
        repository.add(customer);
    }

    @Override
    public void set(Customer customer, String id) throws IOException {
        repository.set(customer,id);
    }

    @Override
    public boolean checkID(String id) throws IOException {
        return repository.checkId(id);
    }

    @Override
    public boolean hashCode(String id) {
        return false;
    }


}
