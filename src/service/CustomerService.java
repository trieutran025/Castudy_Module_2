package src.service;

import src.models.Customer;

import java.io.IOException;
import java.util.List;

public interface CustomerService extends Service{
    List<Customer> findAll() throws IOException;
    void add(Customer customer) throws IOException;
    void set(Customer customer,String id) throws IOException;
}
