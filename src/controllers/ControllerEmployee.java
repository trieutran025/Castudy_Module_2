package src.controllers;

import src.models.Employee;

import java.util.List;
import java.util.Objects;

import static src.controllers.FurumaController.employeeService;
import static src.controllers.Menu.scanner;


public class ControllerEmployee {
    private static String level;
    private static String position;


    private static long checkSalary(String position){
        if(Objects.equals(position, "Reception")){
            return 10000000;
        } else if (Objects.equals(position, "Serve")) {
            return 5000000;
        } else if (Objects.equals(position, "Expert")) {
            return 12000000;
        } else if (Objects.equals(position, "Supervise")) {
            return 8000000;
        }else if(Objects.equals(position, "Administer")){
            return 20000000;
        }else {
            return 50000000;
        }
    }
    private static void viewChoiceLevel(){
        System.out.println("1.Intermediate\n2.College\n3.University\n4.Postgraduate");
    }
    private static String choiceLevel(int choice) {
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
                System.out.println("Please Choice Level again!");
                viewChoiceLevel();
                return choiceLevel(scanner.nextInt());
        }
        return level;
    }
    private static void viewChoicePosition(){
        System.out.println("1.Reception\n2.Serve\n3.Expert\n4.Supervise\n5.Administer\n6.Director");
    }
    private static String choicePosition(int choice){
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
                    System.out.println("Please choice Position again!");
                    viewChoicePosition();
                    return choicePosition(scanner.nextInt());
            }
        return position;
    }

    public static void findAll(){
        List<Employee> employeeList = employeeService.findAll();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
    public static void add(){
        System.out.print("Enter EmployeeCode:");
        String employeeCode = scanner.next();
        System.out.print("Enter name Employee:");
        String name = scanner.next();
        while (!name.matches(ControllerCustomer.REGEX_NAME)){
            System.out.print("Enter again name:");
            name = scanner.next();
        }
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
        System.out.println("Choice level Employee!");
        viewChoiceLevel();
         level = choiceLevel(scanner.nextInt());
//        String level = scanner.next();4
        System.out.println("Choice Position Employee!");
        viewChoicePosition();
        position = choicePosition(scanner.nextInt());
//      String position = scanner.next();
        System.out.print("Enter salary Employee:");
        long salary = checkSalary(position);
        Employee employee = new Employee(employeeCode, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
        employeeService.add(employee);
    }
    public static void set(){
        System.out.print("Enter EmployeeCode:");
        String employeeCode = scanner.next();
        System.out.print("Enter new name Employee:");
        String name = scanner.next();
        System.out.print("Enter new birth day of Employee:");
        String birth = scanner.next();
        System.out.print("Enter new gender of Employee:");
        String gender = scanner.next();
        System.out.print("Enter new identityCard Employee:");
        String identityCard = scanner.next();
        System.out.print("Enter new numberPhone Employee:");
        String numberPhone = scanner.next();
        System.out.print("Enter new email Employee:");
        String email = scanner.next();
        System.out.print("Enter new level Employee:");
        viewChoiceLevel();
        level = choiceLevel(scanner.nextInt());
        System.out.print("Enter new Position Employee:");
        viewChoiceLevel();
        position = choicePosition(scanner.nextInt());
        System.out.print("Enter new salary Employee:");
        long salary = checkSalary(position);
        employeeService.set(employeeCode, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
    }
}
