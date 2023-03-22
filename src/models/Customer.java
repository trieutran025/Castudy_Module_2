package src.models;

public class Customer extends Person {
    private String customerCode;

    private String customerType;
    private String address;

    public Customer(String customerCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String customerType, String address) {
        super(name, birth, gender, identityCard, numberPhone, email);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
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
        return super.toString()+
                "Customer:"+
                "email='" + getEmail() + "\'" +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
