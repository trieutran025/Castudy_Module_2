package src.controllers;

import src.service.*;
import src.service.FacilityServiceImpl;
import src.service.Impl.BookingServiceImpl;
import src.service.Impl.CustomerServiceImpl;
import src.service.Impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static src.controllers.Menu.*;


public class FurumaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static EmployeeService employeeService = new EmployeeServiceImpl();
    public static CustomerService customerService = new CustomerServiceImpl();
    public static FacilityService facilityService = new FacilityServiceImpl();
    public static BookingService bookingService = new BookingServiceImpl();

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
            try {
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
                        System.out.println(displayBooking());
                        break;
                    case 5:
                        System.out.println("-------------------------------------");
                        System.out.println("1. Display list customers use bookingService");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        System.out.println("-------------------------------------");
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Input number again!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Input must be Number and type Number is integer!");
                break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }
}