package src.controllers;

import src.models.House;
import src.models.Room;
import src.models.Villa;

import static src.controllers.FurumaController.facilityService;
import static src.controllers.Menu.scanner;

public class ControllerFacility {
    public static void add() {
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
                    System.out.print("Enter serviceName:");
                    String serviceName = scanner.next();
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
                    Villa villa = new Villa(serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandards, poolAre, numberFloors);
                    facilityService.addFacility(villa);
                    break;
                case 2:
                    System.out.println("Enter serviceName:");
                    serviceName = scanner.next();
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
                    House house = new House(serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandards, numberFloors);
                    facilityService.addFacility(house);
                    break;
                case 3:
                    System.out.println("Enter serviceName:");
                    serviceName = scanner.next();
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
                    Room room = new Room(serviceName, usableArea, rentalCost, maxPeople, rentalType, serviceFree);
                    facilityService.addFacility(room);
                    break;
                case 4:
                    break;
            }
            if (choice == 4) {
                break;
            }
        } while (true);
    }

}
