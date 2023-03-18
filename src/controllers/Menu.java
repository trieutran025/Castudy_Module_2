package src.controllers;

import src.models.House;
import src.models.Room;
import src.models.Villa;

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
                    do {
                        System.out.println("-------------------------------------");
                        System.out.println("1. Add New Villa");
                        System.out.println("2. Add New House");
                        System.out.println("3. Add New Room");
                        System.out.println("4. Back to menu");
                        System.out.println("-------------------------------------");
                        System.out.println("Enter choice:");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.print("Enter usableArea :");
                                double usableArea = scanner.nextDouble();
                                System.out.print("Enter rentalCost:");
                                long rentalCost = scanner.nextLong();
                                System.out.print("Enter maxPeople:");
                                int maxPeople = scanner.nextInt();
                                System.out.print("Enter  rentalType:");
                                String rentalType = scanner.next();
                                System.out.print("Enter  roomStandards:");
                                int roomStandards = scanner.nextInt();
                                System.out.print("Enter poolAre :");
                                double poolAre = scanner.nextDouble();
                                System.out.print("Enter numberFloors:");
                                int numberFloors = scanner.nextInt();
                                Villa villa = new Villa(usableArea, rentalCost, maxPeople, rentalType, roomStandards, poolAre, numberFloors);
                                facilityService.addFacility(villa);
                                break;
                            case 2:
                                System.out.print("Enter usableAre:");
                                usableArea = scanner.nextDouble();
                                System.out.print("Enter rentalCost:");
                                rentalCost = scanner.nextLong();
                                System.out.print("Enter maxPeople:");
                                maxPeople = scanner.nextInt();
                                System.out.print("Enter  rentalType:");
                                rentalType = scanner.next();
                                System.out.print("Enter  roomStandards:");
                                roomStandards = scanner.nextInt();
                                System.out.print("Enter numberFloors:");
                                numberFloors = scanner.nextInt();
                                House house = new House(usableArea, rentalCost, maxPeople, rentalType, roomStandards, numberFloors);
                                facilityService.addFacility(house);
                                break;
                            case 3:
                                System.out.print("Enter usableAre:");
                                usableArea = scanner.nextDouble();
                                System.out.print("Enter rentalCost:");
                                rentalCost = scanner.nextLong();
                                System.out.print("Enter maxPeople:");
                                maxPeople = scanner.nextInt();
                                System.out.println("Enter rentalType:");
                                rentalType = scanner.next();
                                System.out.println("Enter serviceFree:");
                                String serviceFree = scanner.next();
                                Room room = new Room(usableArea, rentalCost, maxPeople, rentalType, serviceFree);
                                facilityService.addFacility(room);
                                break;
                            case 4:
                                break;
                        }
                        if (choice == 4) {
                            break;
                        }
                    } while (true);
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
