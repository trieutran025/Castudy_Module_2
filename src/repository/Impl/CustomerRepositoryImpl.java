package src.repository.Impl;

import src.models.Customer;
import src.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static final List<Customer> customerList;

    static {
        customerList = new ArrayList<>();
    }

    @Override
    public List<Customer> findAll() {
        return new LinkedList<>(customerList);
    }

    @Override
    public void add(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void set(String customerCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address) {
        for(Customer customer : customerList){
            if(customer.getCustomerCode().equals(customerCode)){
                customer.setName(name);
                customer.setBirth(birth);
                customer.setGender(gender);
                customer.setIdentityCard(identityCard);
                customer.setNumberPhone(numberPhone);
                customer.setEmail(email);
                customer.setCustomerType(customerType);
                customer.setAddress(address);
            }
        }
    }
}
