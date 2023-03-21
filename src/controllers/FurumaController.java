package src.controllers;

import src.service.CustomerService;
import src.service.EmployeeService;
import src.service.FacilityService;
import src.service.FacilityServiceImpl;
import src.service.Impl.CustomerServiceImpl;
import src.service.Impl.EmployeeServiceImpl;

import java.util.Scanner;

import static src.controllers.Menu.*;


public class FurumaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static EmployeeService employeeService = new EmployeeServiceImpl();
    public static CustomerService customerService = new CustomerServiceImpl();
    public static FacilityService facilityService = new FacilityServiceImpl();

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
                    System.out.println(displayMenuEmployees());
                    break;
                case 2:
                    System.out.println(displayMenuCustomer());
                    break;
                case 3:
                    System.out.println(displayMenuFacility());
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("1. Display list booking");
                    System.out.println("2. Add new booking");
                    System.out.println("3. Create new constracts");
                    System.out.println("4. Display list contracts ");
                    System.out.println("5. Edit contracts");
                    System.out.println("6. Return main menu");
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