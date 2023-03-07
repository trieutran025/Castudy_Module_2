package src.controllers;

import src.models.Customer;
import src.models.Employee;
import src.service.CustomerService;
import src.service.CustomerServiceImpl;
import src.service.EmployeeService;
import src.service.EmployeeServiceImpl;


import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static EmployeeService service = new EmployeeServiceImpl();
    public static CustomerService customerService = new CustomerServiceImpl();
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------------------Menu--------------------");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("----------------------End------------------");
            System.out.print("Enter 1 -> 6:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("-------------------------------------");
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu ");
                        System.out.println("-------------------------------------");
                        System.out.print("Enter 1 -> 4:");
                        int numberChoice = scanner.nextInt();
                        switch (numberChoice) {
                            case 1:
                                List<Employee> employeeList = service.findAll();
                                for (Employee employee : employeeList) {
                                    System.out.println(employee);
                                }
                                break;
                            case 2:
                                System.out.print("Enter EmployeeCode:");
                                String employeeCode = scanner.next();
                                System.out.print("Enter name Employee:");
                                String name = scanner.next();
                                System.out.print("Enter birth day of Employee:");
                                String birth = scanner.next();
                                System.out.print("Enter gender of Employee:");
                                String gender = scanner.next();
                                System.out.print("Enter identityCard Employee:");
                                String identityCard = scanner.next();
                                System.out.print("Enter numberPhone Employee:");
                                String numberPhone = scanner.next();
                                System.out.print("Enter email Employee:");
                                String email = scanner.next();
                                System.out.print("Enter level Employee:");
                                String level = scanner.next();
                                System.out.print("Enter Position Employee:");
                                String position = scanner.next();
                                System.out.print("Enter salary Employee:");
                                long salary = scanner.nextLong();

                                Employee employee = new Employee(employeeCode, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
                                service.addEmployee(employee);
                                break;
                            case 3:
                                System.out.print("Enter EmployeeCode:");
                                employeeCode = scanner.next();
                                System.out.print("Enter new name Employee:");
                                name = scanner.next();
                                System.out.print("Enter new birth day of Employee:");
                                birth = scanner.next();
                                System.out.print("Enter new gender of Employee:");
                                gender = scanner.next();
                                System.out.print("Enter new identityCard Employee:");
                                identityCard = scanner.next();
                                System.out.print("Enter new numberPhone Employee:");
                                numberPhone = scanner.next();
                                System.out.print("Enter new email Employee:");
                                email = scanner.next();
                                System.out.print("Enter new level Employee:");
                                level = scanner.next();
                                System.out.print("Enter new Position Employee:");
                                position = scanner.next();
                                System.out.print("Enter new salary Employee:");
                                salary = scanner.nextLong();
                                service.setEmployee(employeeCode, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
                                break;
                            case 4:
                                PrintStream out = System.out;
                        }
                    }while (true);
                case 2:
                    do {
                        System.out.println("-------------------------------------");
                        System.out.println("1. Display list customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu ");
                        System.out.println("-------------------------------------");
                        System.out.print("Enter 1 ->4:");
                        int numberChoice = scanner.nextInt();
                        switch (numberChoice){
                            case 1:
                                List<Customer> customerList = customerService.findAll();
                                for (Customer customer : customerList){
                                    System.out.println(customer);
                                }
                        }
                    }while (true);
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("1. Display list facility");
                    System.out.println("2. Add new facility");
                    System.out.println("3. Edit facility");
                    System.out.println("4. Return main menu ");
                    System.out.println("--------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("1. Display list booking");
                    System.out.println("2. Add new booking");
                    System.out.println("3. Edit booking");
                    System.out.println("4. Return main menu ");
                    System.out.println("-------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------");
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    System.out.println("-------------------------------------");
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
