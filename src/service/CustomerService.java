package src.service;

import src.models.Customer;

import java.util.List;

public interface CustomerService extends Service{
    List<Customer> findAll();
    void addCustomer(Customer customer);
    void setCustomer(String customerCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address);
}
