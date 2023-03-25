package src.controllers;

import src.libs.MyRegex;
import src.models.Customer;
import src.utils.MyUtil;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
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
            try {
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
            } catch (InputMismatchException e) {
                System.out.println("Input must be Number and type Number is integer!");
            }
        } while (Objects.equals(customerType, ""));
        return customerType;
    }
    public static boolean checkId(String id) throws IOException {
        return customerService.checkID(id);
    }
    public static void findAll() throws IOException {
        List<Customer> customerList = customerService.findAll();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static void addCustomer() throws IOException {
        scanner.nextLine();
        String customerID;
        do {
            System.out.print("Enter CustomerCode(C-XXXX):");
            customerID = scanner.next();
            if(checkId(customerID)){
                System.out.println("ID Da ton tai!");
            }
        } while (!customerID.matches(REGEX_CUSTOMER_ID)||checkId(customerID));
            String customerName;
            do {
                System.out.print("Enter customer name:");
                customerName = scanner.next();
            } while (!customerName.matches(REGEX_NAME));

            String birth = null;
            boolean check = false;
            do {
                try {
                    System.out.print("Enter birthday(dd/MM/yyyy):");
                    birth = scanner.next();
                    LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern(MyRegex.REGEX_DATE));
                    LocalDate today = LocalDate.now();
                    int age = Period.between(birthday, today).getYears();
                    check = MyUtil.checkDate(age);
                    if (!check) {
                        System.out.println("Enter birthday is age :>= 18 or <=100");
                    }
                } catch (DateTimeParseException e) {
                    System.err.println("Error convent date");
                    System.out.println();
                }
            } while (!check);
            MyUtil.ViewGender();
            String gender = MyUtil.setGender(scanner.nextInt());
            String identityCard;
            boolean b;
            do {
                scanner.nextLine();
                System.out.print("Enter identityCard:");
                identityCard = scanner.nextLine();
                b = !identityCard.matches(MyRegex.REGEX_ID_NUMBER);
                if (!b) {
                    System.out.println("input identityCard number 9 or 12 !");
                }
            } while (!b);
            String numberPhone;
            do {
                System.out.print("Enter number phone:");
                numberPhone = scanner.nextLine();
                if (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE)) {
                    System.out.println("Enter must be format!");
                }
            } while (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE));
            String email;
            do {
                System.out.println("Enter email:");
                email = scanner.nextLine();
                if (!email.matches(MyRegex.REGEX_EMAIL)) {
                    System.out.println("Enter email must be format!");
                }
            } while (!email.matches(MyRegex.REGEX_EMAIL));
            System.out.print("Choice CustomerType");
            ViewChoice();
            String Type = choiceCustomerType(scanner.nextInt());
            System.out.print("Enter Address Customer:");
            String address = scanner.next();
            Customer customer = new Customer(customerID, customerName, birth, gender, identityCard, numberPhone, email, Type, address);
            customerService.add(customer);
        }
    public static void setCustomer() throws IOException {
        scanner.nextLine();
        String customerID;
        do {
            System.out.print("Enter CustomerCode(C-XXXX):");
            customerID = scanner.next();
        } while (!customerID.matches(REGEX_CUSTOMER_ID));

        String customerName;
        do {
            System.out.print("Enter customer name:");
            customerName = scanner.next();
        } while (!customerName.matches(REGEX_NAME));
        String birth;
        boolean check;
        do {
            System.out.print("Enter birthday(dd/MM/yyyy):");
            birth = scanner.next();
            LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern(MyRegex.REGEX_DATE));
            LocalDate today = LocalDate.now();
            int age = Period.between(birthday, today).getYears();
            check = MyUtil.checkDate(age);
            if (!check) {
                System.out.println("Enter birthday is age :>= 18 or <=100");
            }
        } while (!check);
        MyUtil.ViewGender();
        String gender = MyUtil.setGender(scanner.nextInt());
        String identityCard;
        boolean b;
        do{
            System.out.print("Enter identityCard:");
            identityCard = scanner.nextLine();
            b =!identityCard.matches(MyRegex.REGEX_NUMBER_PHONE);
            if(!b){
                System.out.println("input identityCard number 9 or 12 !");
            }
        }while (!b);
        String numberPhone;
        do {
            System.out.print("Enter number phone:");
            numberPhone = scanner.nextLine();
            if (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE)) {
                System.out.println("Enter must be format!");
            }
        } while (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE));
        String email;
        do {
            System.out.println("Enter email:");
            email = scanner.nextLine();
            if (!email.matches(MyRegex.REGEX_EMAIL)) {
                System.out.println("Enter email must be format!");
            }
        } while (!email.matches(MyRegex.REGEX_EMAIL));
        System.out.print("choice Customer type:");
        ViewChoice();
        String Type = choiceCustomerType(scanner.nextInt());
        System.out.print("Enter new Address Customer:");
        String address = scanner.next();
        customerService.set(new Customer(customerID, customerName, birth, gender, identityCard, numberPhone, email, Type, address), customerID);
    }
}
