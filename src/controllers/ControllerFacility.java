package src.controllers;

import src.libs.MyRegex;
import src.models.Facility;
import src.models.House;
import src.models.Room;
import src.models.Villa;

import java.util.Map;

import static src.controllers.FurumaController.facilityService;
import static src.controllers.Menu.scanner;

public class ControllerFacility {

    public static void addNewVilla() {
        String serviceID;
        do {
            System.out.print("Enter serviceID(SVVL-YYY):");
            serviceID = scanner.next();
            if (!serviceID.matches(MyRegex.REGEX_SERVICE_VILLA)) {
                System.out.println("ServiceID must be (SVVL-YYYY)!");
            }
        } while (!serviceID.matches(MyRegex.REGEX_SERVICE_VILLA));

        String serviceName;
        do {
            System.out.print("Enter serviceName:");
            serviceName = scanner.nextLine();
        } while (!serviceName.matches(MyRegex.REGEX_NAME));

        double usableArea = 0;
        do {
            try {
                System.out.print("Enter usable area >30m2:");
                usableArea = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (usableArea <= 30);

        long rentalCost = 0;
        do {
            try {
                System.out.print("Enter rental cost:");
                rentalCost = Long.parseLong(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (rentalCost < 0);

        System.out.print("Enter maxPeople:");
        int maxPeople = scanner.nextInt();

        System.out.print("Enter rentalType:");
        String rentalType = scanner.next();

        System.out.print("Enter roomStandards:");
        int roomStandards = scanner.nextInt();

        System.out.print("Enter poolArea:");
        double poolArea = scanner.nextDouble();

        System.out.print("Enter numberFloors:");
        int numberFloors = scanner.nextInt();

// create a new Villa object with the entered values
        Villa villa = new Villa(serviceID, serviceName, rentalCost, maxPeople, rentalType, roomStandards, poolArea, numberFloors);
        facilityService.addFacility(villa);

    }

    public static void addNewHouse() {
        String serviceID;
        do {
            System.out.print("Enter serviceID(SVHO-YYY):");
            serviceID = scanner.next();
            if (!serviceID.matches(MyRegex.REGEX_SERVICE_ROOM)) {
                System.out.print("ServiceID must be (SVHO-YYYY)!");
            }
        } while (!serviceID.matches(MyRegex.REGEX_SERVICE_ROOM));
        String serviceName;
        do {
            System.out.print("Enter serviceName:");
            serviceName = scanner.nextLine();
        } while (!serviceName.matches(MyRegex.REGEX_NAME));
        double usableArea = 0;
        do {
            try {
                System.out.print("Enter usable area >30m2");
                usableArea = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (usableArea <= 30);
        long rentalCost = 0;
        do {
            try {
                System.out.print("Enter rental cost");
                rentalCost = Long.parseLong(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (rentalCost < 0);
        System.out.print("Enter max People:");
        int maxPeople = scanner.nextInt();
        System.out.print("Enter  rentalType:");
        String rentalType = scanner.next();
        System.out.print("Enter  roomStandards:");
        int roomStandards = scanner.nextInt();
        System.out.print("Enter numberFloors:");
        int numberFloors = scanner.nextInt();
        House house = new House(serviceID, serviceName, 1, rentalCost, maxPeople, rentalType, roomStandards, numberFloors);
        facilityService.addFacility(house);
    }

    public static void addNewRoom() {
        String serviceID;
        do {
            System.out.print("Enter serviceID(SVXX-YYY):");
            serviceID = scanner.nextLine();
            if (!serviceID.matches(MyRegex.REGEX_SERVICE_ROOM)) {
                System.out.print("ServiceID must be (SVXX-YYYY)!");
            }
        } while (!serviceID.matches(MyRegex.REGEX_SERVICE_ROOM));
        String serviceName;
        do {
            System.out.print("Enter serviceName:");
            serviceName = scanner.nextLine();
        } while (!serviceName.matches(MyRegex.REGEX_NAME));
        double usableArea = 0;
        do {
            try {
                System.out.println("Enter usable area >30m2");
                usableArea = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Input is Number");
            }
        } while (usableArea <= 30);
        long rentalCost = 0;
        do {
            try {
                System.out.print("Enter rental cost");
                rentalCost = Long.parseLong(scanner.next());
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (rentalCost < 0);
        System.out.print("Enter maxPeople:");
        int maxPeople = scanner.nextInt();
        System.out.println("Enter rentalType:");
        String rentalType = scanner.next();
        System.out.println("Enter serviceFree:");
        String serviceFree = scanner.next();
        Room room = new Room(serviceID, "1", 1, rentalCost, maxPeople, rentalType, serviceFree);
        facilityService.addFacility(room);
    }

    public static void display() {
        Map<Facility, Integer> displayFacility = facilityService.displayFacility();
        for (Facility key : displayFacility.keySet()) {
            System.out.println(key + " - " + displayFacility.get(key));
        }
    }


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
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
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
