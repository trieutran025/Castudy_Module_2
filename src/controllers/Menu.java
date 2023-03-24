package src.controllers;


import java.io.IOException;
import java.util.Scanner;

import static src.controllers.FurumaController.facilityService;


public class Menu {
    public static Scanner scanner = new Scanner(System.in);


    public static boolean displayMenuEmployees() throws IOException {
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
                    ControllerEmployee.findAll();
                    break;
                case 2:
                    ControllerEmployee.add();
                    break;
                case 3:
                    ControllerEmployee.set();
                case 4:
                    break;
            }
            if (numberChoice == 4) {
                break;
            }
        } while (true);
        return false;
    }

    public static boolean displayMenuCustomer() throws IOException {
        do {
            System.out.println("-------------------------------------");
            System.out.println("1. Display list customer");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu ");
            System.out.println("-------------------------------------");
            System.out.print("Enter 1 ->4:");
            int numberChoice = scanner.nextInt();
            switch (numberChoice) {
                case 1:
                    ControllerCustomer.findAll();
                    break;
                case 2:
                    ControllerCustomer.addCustomer();
                    break;
                case 3:
                    ControllerCustomer.setCustomer();
                case 4:
                    break;
            }
            if (numberChoice == 4) {
                break;
            }
        } while (true);
        return false;
    }

    public static boolean displayMenuFacility() {
        do {
            System.out.println("-------------------------------------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu ");
            System.out.println("--------------------------------------");
            System.out.print("Enter 1 ->4:");
            int numberChoice = scanner.nextInt();
            switch (numberChoice) {
                case 1:
                    ControllerFacility.display();
                    break;
                case 2:
                    ControllerFacility.add();
                    break;
                case 3:
                        facilityService.displayListMaintenance();
                    break;
                case 4:
                    break;
            }
            if (numberChoice == 4) {
                break;
            }
        } while (true);
        return false;
    }
    public static boolean displayBooking() {
        int number;
        do {
            System.out.println("-------------------------------------");
            System.out.println("1. Display list booking");
            System.out.println("2. Add new booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts ");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            System.out.println("-------------------------------------");
            System.out.print("Enter number choice 1-->6:");
            number=scanner.nextInt();
            switch (number){
                case 1 : ControllerBooking.findAdd();break;
                case 6: break;
            }
            if(number==6){
                break;
            }
        }while (true);
        return false;
    }
}
