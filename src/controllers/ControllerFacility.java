package src.controllers;

import src.libs.MyRegex;
import src.models.Facility;
import src.models.House;
import src.models.Room;
import src.models.Villa;
import src.utils.MyUtil;

import java.util.InputMismatchException;
import java.util.Map;

import static src.controllers.FurumaController.facilityService;
import static src.controllers.Menu.scanner;

public class ControllerFacility {

    public static void addNewVilla() {
        scanner.nextLine();
        String regexName = "^Villa$";
        String serviceID;
        do {
            System.out.print("Enter serviceID(SVVL-YYY):");
            serviceID = scanner.nextLine();
            if (!serviceID.matches(MyRegex.REGEX_SERVICE_VILLA)) {
                System.out.println("ServiceID must be (SVVL-YYYY)!");
            }
        } while (!serviceID.matches(MyRegex.REGEX_SERVICE_VILLA));

        String serviceName;
        do {
            System.out.print("Enter serviceName:");
            serviceName = scanner.nextLine();
            if (!serviceName.matches(regexName)) {
                System.out.println("Enter serviceName again must be Villa!");
            }
        } while (!serviceName.matches(regexName));

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

        int maxPeople;
        boolean check;
        do {
            System.out.print("Enter max people:");
            maxPeople = Integer.parseInt(scanner.next());
            check = (maxPeople > 0 && maxPeople < 20);
            if (!check) {
                System.out.println("People must be >0 and <20!");
            }
        } while (!check);
        MyUtil.viewRentalType();
        String rentalType = MyUtil.setRentalType(scanner.nextInt());
        MyUtil.ViewChoiceStandards();
        String roomStandards = MyUtil.setRomStandards(scanner.nextInt());
        double poolArea = 0;
        do {
            try {
                System.out.print("Enter poll area >30m2:");
                poolArea = Double.parseDouble(scanner.next());
                if (poolArea <= 30) {
                    System.out.println("Please Enter poll area >30m2");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (poolArea <= 30);
        int numberFloors = 0;
        do {
            try {
                System.out.print("Enter number floors:");
                numberFloors = Integer.parseInt(scanner.next());
                if (numberFloors < 0) {
                    System.out.println("number float > 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input is int!");
            }
        } while (numberFloors < 0);
        Villa villa = new Villa(serviceID, serviceName, rentalCost, maxPeople, maxPeople, rentalType, roomStandards, poolArea, numberFloors);
        facilityService.addFacility(villa);

    }

    public static void addNewHouse() {
        scanner.nextLine();
        String regexName = "^House$";
        String serviceID;
        do {
            System.out.print("Enter serviceID(SVHO-YYY):");
            serviceID = scanner.next();
            if (!serviceID.matches(MyRegex.REGEX_SERVICE_HOUSE)) {
                System.out.print("ServiceID must be (SVHO-YYYY)!");
            }
        } while (!serviceID.matches(MyRegex.REGEX_SERVICE_HOUSE));
        String serviceName;
        do {
            System.out.print("Enter serviceName:");
            serviceName = scanner.nextLine();
            if (!serviceName.matches(regexName)) {
                System.out.println("Enter serviceName again must be House!");
            }
        } while (!serviceName.matches(regexName));
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
        int maxPeople;
        boolean check;
        do {
            System.out.print("Enter max people:");
            maxPeople = Integer.parseInt(scanner.next());
            check = (maxPeople > 0 && maxPeople < 20);
            if (!check) {
                System.out.println("People must be >0 or <20!");
            }
        } while (!check);
        MyUtil.viewRentalType();
        String rentalType = MyUtil.setRentalType(scanner.nextInt());
        MyUtil.ViewChoiceStandards();
        String roomStandards = MyUtil.setRomStandards(scanner.nextInt());
        int numberFloors = 0;
        do {
            try {
                System.out.print("Enter number floors:");
                numberFloors = Integer.parseInt(scanner.next());
                if (numberFloors < 0) {
                    System.out.print("number float > 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input is Number!");
            }
        } while (numberFloors < 0);
        House house = new House(serviceID, serviceName, 1, rentalCost, maxPeople, rentalType, roomStandards, numberFloors);
        facilityService.addFacility(house);
    }

    public static void addNewRoom() {
        scanner.nextLine();
        String regexName = "^Room$";
        String serviceID;
        do {
            System.out.print("Enter serviceID(SVRO-YYY):");
            serviceID = scanner.nextLine();
            if (!serviceID.matches(MyRegex.REGEX_SERVICE_ROOM)) {
                System.out.print("ServiceID must be (SVRO-YYYY)!");
            }
        } while (!serviceID.matches(MyRegex.REGEX_SERVICE_ROOM));
        String serviceName;
        do {
            System.out.print("Enter serviceName:");
            serviceName = scanner.nextLine();
            if (!serviceName.matches(regexName)) {
                System.out.println("Enter serviceName again must be House!");
            }
        } while (!serviceName.matches(regexName));
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
        int maxPeople;
        boolean check;
        do {
            System.out.print("Enter max people:");
            maxPeople = Integer.parseInt(scanner.next());
            check = (maxPeople > 0 && maxPeople < 20);
            if (!check) {
                System.out.println("People must be >0 or <20!");
            }
        } while (!check);
        MyUtil.viewRentalType();
        String rentalType = MyUtil.setRentalType(scanner.nextInt());
        MyUtil.ViewChoiceServiceFree();
        String serviceFree = String.valueOf(Integer.parseInt(MyUtil.setServiceFree(scanner.nextInt())));
        Room room = new Room(serviceID, serviceName, usableArea, rentalCost, maxPeople, rentalType, serviceFree);
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
            System.out.print("Enter choice:");
            try {
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
                    default:
                        System.out.println("Please Enter number 1 -> 4:");
                }
                if (choice == 4) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be Number and type Number is integer!");
            }
        } while (true);
    }

}
