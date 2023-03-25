package src.models;

import java.util.Objects;

public class Customer extends Person  {


    private String customerType;
    private String address;

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String id, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address) {
        super(id, name, birth, gender, identityCard, numberPhone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }


    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCustomerType(), customer.getCustomerType()) && Objects.equals(getAddress(), customer.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
