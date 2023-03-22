package src.controllers;

import src.libs.MyRegex;
import src.models.Customer;
import src.utils.MyUtil;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

import static src.controllers.FurumaController.customerService;
import static src.controllers.Menu.scanner;

public class ControllerCustomer {
    private static String customerType;
    public static final String REGEX_CUSTOMER_ID = "^C-[0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";

    public static void ViewChoice() {
        System.out.println("Choice Type:");
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
        scanner.nextLine();
        String customerID;
        do {
            System.out.print("Enter CustomerCode(KH-XXXX):");
            customerID = scanner.next();
        } while (!customerID.matches(REGEX_CUSTOMER_ID));

        String customerName;
        do {
            System.out.println("Enter customer :");
            customerName = scanner.next();
        } while (!customerName.matches(REGEX_NAME));

        String birth;
        boolean check;
        do{
            System.out.print("Enter birthday(dd/MM/yyyy):");
            birth = scanner.next();
            LocalDate birthday = LocalDate.parse(birth,DateTimeFormatter.ofPattern(MyRegex.REGEX_DATE));
            LocalDate today = LocalDate.now();
            int age = Period.between(birthday, today).getYears();
            check  = MyUtil.checkDate(age);
            if(!check){
                System.out.println("Enter birthday is age :>= 18 or <=100");
            }
        }while (!check);
        MyUtil.ViewGender();
        String gender = MyUtil.setGender(scanner.nextInt());
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
         Customer customer = new Customer(customerID, customerName, birth, gender, identityCard, numberPhone, email, Type, address);
        customerService.add(customer);
    }

    public static void setCustomer() {
        scanner.nextLine();
        String customerID;
        do {
            System.out.print("Enter CustomerCode(KH-XXXX):");
            customerID = scanner.next();
        } while (!customerID.matches(REGEX_CUSTOMER_ID));

        String customerName;
        do {
            System.out.println("Enter customer :");
            customerName = scanner.next();
        } while (!customerName.matches(REGEX_NAME));
        String birth;
        boolean check;
        do{
            System.out.print("Enter birthday(dd/MM/yyyy):");
            birth = scanner.next();
            LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern(MyRegex.REGEX_DATE));
            LocalDate today = LocalDate.now();
            int age = Period.between(birthday, today).getYears();
            check  = MyUtil.checkDate(age);
            if(!check){
                System.out.println("Enter birthday is age :>= 18 or <=100");
            }
        }while (!check);
        MyUtil.ViewGender();
        String gender = MyUtil.setGender(scanner.nextInt());
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
        customerService.set(customerID, customerName, birth, gender, identityCard, numberPhone, email, Type, address);
    }
}
