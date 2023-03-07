package src.service;

import src.models.Customer;
import src.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository repository =(CustomerRepository) new EmployeeServiceImpl();
    @Override
    public List<Customer> findAll() {
       return repository.findAll();
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.addCustomer(customer);
    }

    @Override
    public void setCustomer(String customerCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address) {
        repository.setCustomer( customerCode,  name,  birth,  gender,  identityCard,  numberPhone,  email,  customerType,  address);
    }
}
