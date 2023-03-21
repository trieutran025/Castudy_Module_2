package src.controllers;

import src.models.Customer;

import java.util.List;
import java.util.Objects;

import static src.controllers.FurumaController.customerService;
import static src.controllers.Menu.scanner;

public class ControllerCustomer {
    private static String customerType;
    public static final String REGEX_CUSTOMER_ID = "^KH-[0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";

    public static void ViewChoice() {
        System.out.println("1.Diamond\n2.Platinum\n3.Gold\n4.Silver\n5.Member");
    }

    public static String choiceCustomerType(int numberChoice) {
        do {
            switch (numberChoice) {
                case 1:
                    customerType = "Diamond";
                    break;
                case 2:
                    customerType = "Platinum";
                    break;
                case 3:
                    customerType = "Gold";
                    break;
                case 4:
                    customerType = "Silver";
                    break;
                case 5:
                    customerType = " Member";
                    break;
                default:
                    System.out.println("Enter Please again:");
                    break;
            }
        } while (Objects.equals(customerType, ""));
        return customerType;
    }

    public static void findAll() {
        List<Customer> customerList = customerService.findAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static void addCustomer() {
        String customerCode;
        do {
            System.out.print("Enter CustomerCode(KH-XXXX):");
            customerCode = scanner.next();
        } while (!customerCode.matches(REGEX_CUSTOMER_ID));

        String customerName;
        do {
            System.out.println("Enter customer :");
            customerName = scanner.next();
        } while (!customerName.matches(REGEX_NAME));

        System.out.print("Enter birth Customer:");
        String customerBirth = scanner.next();
        System.out.print("Enter gender Customer:");
        String customerGender = scanner.next();
        System.out.print("Enter identityCard Customer");
        String identityCard = scanner.next();
        System.out.print("Enter numberPhone Customer:");
        String numberPhone = scanner.next();
        System.out.print("Enter email Customer:");
        String email = scanner.next();
        System.out.print("Choice CustomerType");
        ViewChoice();
        String Type = choiceCustomerType(scanner.nextInt());
        System.out.print("Enter Address Customer:");
        String address = scanner.next();
        Customer customer = new Customer(customerCode, customerName, customerBirth, customerGender, identityCard, numberPhone, email, Type, address);
        customerService.add(customer);
    }

    public static void setCustomer() {
        System.out.print("Enter CustomerCode:");
        String customerCode = scanner.next();
        System.out.print("Enter new  CustomerName:");
        String customerName = scanner.next();
        System.out.print("Enter new birth Customer:");
        String customerBirth = scanner.next();
        System.out.print("Enter new  gender Customer:");
        String customerGender = scanner.next();
        System.out.print("Enter new identityCard Customer");
        String identityCard = scanner.next();
        System.out.print("Enter new numberPhone Customer:");
        String numberPhone = scanner.next();
        System.out.print("Enter new email Customer:");
        String email = scanner.next();
        System.out.print("choice Customer type:");
        ViewChoice();
        String Type = choiceCustomerType(scanner.nextInt());
        System.out.print("Enter new Address Customer:");
        String address = scanner.next();
        customerService.set(customerCode, customerName, customerBirth, customerGender, identityCard, numberPhone, email, Type, address);
    }
}
