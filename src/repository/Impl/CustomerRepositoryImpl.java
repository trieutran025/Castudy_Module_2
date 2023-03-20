package src.repository.Impl;

import src.models.Customer;
import src.repository.CustomerRepository;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static final List<Customer> customerList;

    static {
        customerList = new LinkedList<>();
        customerList.add(new Customer("KH0001","Tom","29/1/2000","Nam","204145555","0788611264","tom012@gmail.com","Gold","112ONamCao"));
        customerList.add(new Customer("KH0002","Mai","3/1/2001","Nu","2010294","1102029401","mai101@gmail.com","Kim cuong","20NguyenNhan"));
        customerList.add(new Customer("KH0003","Gan","29/10/1999","Nam","92929101","010292010","gan0212@gmail.com","bac","11TranHungDao"));
        customerList.add(new Customer("KH0004","Min","2/12/1990","Nu","1230013","02010120391","min1111@gmail.com","dong","120TonDucThang"));
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
