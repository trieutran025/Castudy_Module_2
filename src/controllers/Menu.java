package src.controllers;

import src.models.*;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import static src.controllers.FuramaController.*;

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
                    List<Employee> employeeList = employeeService.findAll();
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
                    System.out.print("Choice level Employee:");
                    System.out.println();
                    System.out.println("------------------------");
                    System.out.println("1.Trung cấp\n2.Cao đẳng\n3.Đại học\n4.Sau đại học");
                    System.out.println("------------------------");
                    String level = "";
                    System.out.print("Enter number 1 --> 4:");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            level = "Trung cấp";
                            break;
                        case 2:
                            level = "Cao đẳng";
                            break;
                        case 3:
                            level = "Đại học";
                            break;
                        case 4:
                            level = "Sau đại học";
                            break;
                    }
//                    String level = scanner.next();4
                    System.out.print("Choice Position Employee:");
                    System.out.println();
                    System.out.println("-------------------------------");
                    System.out.println("1.Lễ tân\n2.Phục vụ\n3.Chuyên viên\n4.Giám sát\n5.Quản lý\n6.Giám đốc");
                    System.out.println("-------------------------------");
                    System.out.println("Enter number 1-->7:");
                    choice = scanner.nextInt();
                    String position = "";
                    switch (choice) {
                        case 1:
                            position = "Lễ tân";
                            break;
                        case 2:
                            position = "Phục vụ";
                            break;
                        case 3:
                            position = "Chuyên viên";
                            break;
                        case 4:
                            position = "Giám sát";
                            break;
                        case 5:
                            position = "Quản lý";
                            break;
                        case 6:
                            position = "Giám đốc";
                            break;
                    }
//                    String position = scanner.next();
                    System.out.print("Enter salary Employee:");
                    long salary = scanner.nextLong();

                    Employee employee = new Employee(employeeCode, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
                    employeeService.add(employee);
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
                    employeeService.set(employeeCode, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
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
                    List<Customer> customerList = customerService.findAll();
                    for (Customer customer : customerList) {
                        System.out.println(customer);
                    }
                    break;
                case 2:
                    System.out.print("Enter CustomerCode:");
                    String customerCode = scanner.next();
                    System.out.print("Enter CustomerName:");
                    String customerName = scanner.next();
                    System.out.print("Enter birth Customer:");
                    String customerBirth = scanner.next();
                    System.out.print("Enter gender Customer:");
                    String customerGender = scanner.next();
                    System.out.print("Enter identityCard Customer");
                    String identityCard = scanner.next();
                    System.out.print("Enter numberPhone Customer:");
                    String numberPhone = scanner.next();
                    System.out.print("Enter email Customer:");
                    String email = scanner.next();
                    System.out.print("Enter CustomerType:");
                    String customerType = scanner.next();
                    System.out.print("Enter Address Customer:");
                    String address = scanner.next();
                    Customer customer = new Customer(customerCode, customerName, customerBirth, customerGender, identityCard, numberPhone, email, customerType, address);
                    customerService.add(customer);
                    break;
                case 3:
                    System.out.print("Enter CustomerCode:");
                    customerCode = scanner.next();
                    System.out.print("Enter new  CustomerName:");
                    customerName = scanner.next();
                    System.out.print("Enter new birth Customer:");
                    customerBirth = scanner.next();
                    System.out.print("Enter new  gender Customer:");
                    customerGender = scanner.next();
                    System.out.print("Enter new identityCard Customer");
                    identityCard = scanner.next();
                    System.out.print("Enter new numberPhone Customer:");
                    numberPhone = scanner.next();
                    System.out.print("Enter new email Customer:");
                    email = scanner.next();
                    System.out.print("Enter new CustomerType:");
                    customerType = scanner.next();
                    System.out.print("Enter new Address Customer:");
                    address = scanner.next();
                    customerService.set(customerCode, customerName, customerBirth, customerGender, identityCard, numberPhone, email, customerType, address);
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
                    Set<Facility> FacilityList = facilityService.displayFacility();
                    for (Facility facility : FacilityList) {
                        System.out.println(facility);
                    }
                    break;
                case 2:
                    do{
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
                                facilityService.addNewVilla(villa);
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
                                facilityService.addNewHouse(house);
                                break;
                            case 3:
                                System.out.print("Enter usableAre:");
                                 usableArea=scanner.nextDouble();
                                System.out.print("Enter rentalCost:");
                                 rentalCost=scanner.nextLong();
                                System.out.print("Enter maxPeople:");
                                 maxPeople=scanner.nextInt();
                                System.out.println("Enter rentalType:");
                                 rentalType =scanner.next();
                                System.out.println("Enter serviceFree:");
                                String serviceFree = scanner.next();
                                Room room = new Room(usableArea,rentalCost,maxPeople,rentalType,serviceFree);
                                facilityService.addNewRoom(room);
                                break;
                            case 4:
                                break;
                        }
                        if (choice == 4) {
                            break;
                        }
                    } while (true);
                case 3:
                    facilityService.displayFacilityMaintenance();
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
