package src.repository;

import src.models.Customer;

import java.io.IOException;
import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll() throws IOException;

    void add(Customer customer) throws IOException;

    void set(Customer customer, String id) throws IOException;
    boolean checkId(String id) throws IOException;
}
