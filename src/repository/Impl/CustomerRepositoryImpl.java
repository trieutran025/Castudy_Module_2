package src.repository.Impl;

import src.models.Customer;
import src.repository.CustomerRepository;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    public static final String FILE_PATH = "D:\\CodeGym\\module_2\\FurumaResort\\src\\data\\customer.csv";

    public static List<Customer> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        List<Customer> customerList = new LinkedList<>();
        String line = "";
        String temp[];
        Customer customer;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            String birth = temp[2];
            String gender = temp[3];
            String identityCard = temp[4];
            String numberPhone = temp[5];
            String email = temp[6];
            String type = temp[7];
            String address = temp[8];
            customer = new Customer(id, name, birth, gender, identityCard, numberPhone, email, type, address);
            customerList.add(customer);
        }
        buff.close();
        return customerList;
    }

    public static void writeCSV(List<Customer> customer) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (Customer customer1 : customer) {
            buff.write(customer1.getId() + "," + customer1.getName() + "," + customer1.getBirth() + "," + customer1.getGender()
                    + "," + customer1.getIdentityCard() + "," + customer1.getNumberPhone() + "," + customer1.getEmail()
                    + "," + customer1.getCustomerType() + "," + customer1.getAddress());
        }
        buff.close();
    }


    @Override
    public List<Customer> findAll() throws IOException {
        return readCSV();
    }

    @Override
    public void add(Customer customer) throws IOException {
        List<Customer> customerList = readCSV();
        customerList.add(customer);
        writeCSV(customerList);
    }

    @Override
    public void set(Customer customer, String id) throws IOException {
        List<Customer> customerList = readCSV();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().equals(id)) {
                customerList.set(i, customer);
                break;
            }
        }
        writeCSV(customerList);
    }

    @Override
    public boolean checkId(String id) throws IOException {
        List<Customer> customerList = readCSV();
        for(int i=0;i<customerList.size();i++){
            if(customerList.get(i).getId().equals(id))
                return true;
        }
        return false;
    }
}
