package src.models;

public class Customer extends Person {


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
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
