package src.repository;

import src.models.Customer;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList;
    static {
        customerList = new LinkedList<>();
    }

    @Override
    public List<Customer> findAll() {
        return new LinkedList<>(customerList);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public void setCustomer(String customerCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address) {
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
