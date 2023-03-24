package src.controllers;

import src.libs.MyRegex;
import src.models.Employee;
import src.utils.MyUtil;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

import static src.controllers.FurumaController.employeeService;
import static src.controllers.Menu.scanner;


public class ControllerEmployee {
    private static String level;
    private static String position;

    public static final String REGEX_ELEMENT_ID = "^E-[0-9]{4}$";

    private static long checkSalary(String position) {
        if (Objects.equals(position, "Reception")) {
            return 10000000;
        } else if (Objects.equals(position, "Serve")) {
            return 5000000;
        } else if (Objects.equals(position, "Expert")) {
            return 12000000;
        } else if (Objects.equals(position, "Supervise")) {
            return 8000000;
        } else if (Objects.equals(position, "Administer")) {
            return 20000000;
        } else {
            return 50000000;
        }
    }

    private static void viewChoiceLevel() {
        System.out.println("1.Intermediate\n2.College\n3.University\n4.Postgraduate");
    }

    private static String choiceLevel(int choice) {
        try {
            switch (choice) {
                case 1:
                    level = "Intermediate";
                    break;
                case 2:
                    level = "College";
                    break;
                case 3:
                    level = "University";
                    break;
                case 4:
                    level = "Postgraduate";
                    break;
                default:
                    System.out.println("Please Choice Level again input number 1->4!");
                    viewChoiceLevel();
                    return choiceLevel(scanner.nextInt());
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be Number and type Number is integer!");
        }
        return level;
    }

    private static void viewChoicePosition() {
        System.out.println("1.Reception\n2.Serve\n3.Expert\n4.Supervise\n5.Administer\n6.Director");
    }

    private static String choicePosition(int choice) {
        try {
            switch (choice) {
                case 1:
                    position = "Reception";
                    break;
                case 2:
                    position = "Serve";
                    break;
                case 3:
                    position = "Expert";
                    break;
                case 4:
                    position = "Supervise";
                    break;
                case 5:
                    position = "Administer";
                    break;
                case 6:
                    position = "Director";
                    break;
                default:
                    System.out.println("Please choice Position again input number 1 -> 6!");
                    viewChoicePosition();
                    return choicePosition(scanner.nextInt());
            }
        } catch (InputMismatchException e) {
            System.out.println("Input must be Number and type Number is integer!");
        }
        return position;
    }

    public static void findAll() throws IOException {
        List<Employee> employeeList = employeeService.findAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void add() throws IOException {
        scanner.nextLine();
        String employeeID;
        do {
            System.out.print("Enter employeeID:");
            employeeID = scanner.next();
            if (!employeeID.matches(REGEX_ELEMENT_ID)) {
                System.out.println("Please element id format E-YYYY(Y is number)!");
            }
        } while (!employeeID.matches(REGEX_ELEMENT_ID));
        String name;
        do {
            System.out.print("Enter employee name :");
            name = scanner.next();
            if (!name.matches(MyRegex.REGEX_NAME)) {
                System.out.println("Enter name again!");
            }
        } while (!name.matches(MyRegex.REGEX_NAME));
        String birth;
        boolean check;
        do {
            System.out.print("Enter birthday(dd/MM/yyyy):");
            birth = scanner.next();
            LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern(MyRegex.REGEX_DATE));
            LocalDate today = LocalDate.now();
            int age = Period.between(birthday, today).getYears();
            check = MyUtil.checkDate(age);
            if (!check) {
                System.out.println("Enter birthday is age :>= 18 or <=100");
            }
        } while (!check);
        MyUtil.ViewGender();
        String gender = MyUtil.setGender(scanner.nextInt());
        String identityCard;
        do {
            System.out.print("Enter identityCard:");
            identityCard = scanner.nextLine();
            if (!identityCard.matches(MyRegex.REGEX_ID_NUMBER)) {
                System.out.println("identityCard must be 9 number or 12 number!");
            }
        } while (!identityCard.matches(MyRegex.REGEX_ID_NUMBER));
        String numberPhone;
        do {
            System.out.print("Enter number phone:");
            numberPhone = scanner.nextLine();
            if (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE)) {
                System.out.println("Enter must be format!");
            }
        } while (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE));
        String email;
        do {
            System.out.print("Enter email:");
            email = scanner.nextLine();
            if (!email.matches(MyRegex.REGEX_EMAIL)) {
                System.out.println("Enter email must be format!");
            }
        } while (!email.matches(MyRegex.REGEX_EMAIL));
        System.out.println("Choice level Employee!");
        viewChoiceLevel();
        level = choiceLevel(scanner.nextInt());
        System.out.println("Choice Position Employee!");
        viewChoicePosition();
        position = choicePosition(scanner.nextInt());
        long salary = checkSalary(position);
        Employee employee = new Employee(employeeID, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
        employeeService.add(employee);
    }

    public static void set() throws IOException {
        scanner.nextLine();
        String employeeID;
        do {
            System.out.print("Enter employeeID:");
            employeeID = scanner.next();
            if (!employeeID.matches(REGEX_ELEMENT_ID)) {
                System.out.println("Please element id format E-YYYY(Y is number)!");
            }
        } while (!employeeID.matches(REGEX_ELEMENT_ID));
        String name;
        do {
            System.out.print("Enter new employee name :");
            name = scanner.next();
            if (!name.matches(MyRegex.REGEX_NAME)) {
                System.out.println("Enter name again!");
            }
        } while (!name.matches(MyRegex.REGEX_NAME));
        String birth;
        boolean check;
        do {
            System.out.print("Enter birthday(dd/MM/yyyy):");
            birth = scanner.next();
            LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern(MyRegex.REGEX_DATE));
            LocalDate today = LocalDate.now();
            int age = Period.between(birthday, today).getYears();
            check = MyUtil.checkDate(age);
            if (!check) {
                System.out.println("Enter birthday is age :>= 18 or <=100");
            }
        } while (!check);
        MyUtil.ViewGender();
        String gender = MyUtil.setGender(scanner.nextInt());
        String identityCard;
        do {
            scanner.nextLine();
            System.out.print("Enter identityCard:");
            identityCard = scanner.nextLine();
            if (!identityCard.matches(MyRegex.REGEX_ID_NUMBER)) {
                System.out.println("identityCard must be 9 number or 12 number!");
            }
        } while (!identityCard.matches(MyRegex.REGEX_ID_NUMBER));
        String numberPhone;
        do {
            System.out.print("Enter number phone:");
            numberPhone = scanner.nextLine();
            if (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE)) {
                System.out.println("Enter must be format!");
            }
        } while (!numberPhone.matches(MyRegex.REGEX_NUMBER_PHONE));
        String email;
        do {
            System.out.println("Enter email:");
            email = scanner.nextLine();
            if (!email.matches(MyRegex.REGEX_EMAIL)) {
                System.out.println("Enter email must be format!");
            }
        } while (!email.matches(MyRegex.REGEX_EMAIL));
        System.out.print("Enter new level Employee:");
        viewChoiceLevel();
        level = choiceLevel(scanner.nextInt());
        System.out.print("Enter new Position Employee:");
        viewChoiceLevel();
        position = choicePosition(scanner.nextInt());
        System.out.print("Enter new salary Employee:");
        long salary = checkSalary(position);
        employeeService.set(new Employee(employeeID, name, birth, gender, identityCard, numberPhone, email, level, position, salary), employeeID);
    }
}
