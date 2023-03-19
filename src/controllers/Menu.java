package src.controllers;

import java.util.Scanner;

import static src.controllers.FuramaController.facilityService;

public class Menu {
    static Scanner scanner = new Scanner(System.in);


    public static boolean displayMenuEmployees() {
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

    public static boolean displayMenuCustomer() {
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

    public static boolean displayMenuFacility() {
        do {
            System.out.println("-------------------------------------");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Return main menu ");
            System.out.println("--------------------------------------");
            System.out.print("Enter 1 ->4:");
            int numberChoice = scanner.nextInt();
            switch (numberChoice) {
                case 1:
                    facilityService.displayFacility();
                    break;
                case 2:
                    ControllerFacility.add();
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
}
