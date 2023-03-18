package src.controllers;

import src.models.Employee;

import java.util.List;

import static src.controllers.FuramaController.employeeService;
import static src.controllers.Menu.scanner;


public class ControllerEmployee {
    private static String level="";
    private static String position="";

    private static void viewChoiceLevel(){
        System.out.println("1.Trung cấp\n2.Cao đẳng\n3.Đại học\n4.Sau đại học");
    }
    private static void viewChoicePosition(){
        System.out.println("1.Lễ tân\n2.Phục vụ\n3.Chuyên viên\n4.Giám sát\n5.Quản lý\n6.Giám đốc");
    }
    private static long checkSalary(String position){
        if(position=="Lễ tân"){
            return 10000000;
        } else if (position=="Phục vụ") {
            return 5000000;
        } else if (position=="Chuyên viên") {
            return 12000000;
        } else if (position=="Giám sát") {
            return 8000000;
        }else if(position=="Quản lý"){
            return 20000000;
        }else {
            return 50000000;
        }
    }
    private static String choicePosition(int choice){
        do {
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
        }while (position.equals(""));
        return position;
    }
    private static String choiceLevel(int choice) {
        do {
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
                default:
                    System.out.println("Please Choice Level!");
                    break;
            }
        } while (level.equals(""));
        return level;
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
        System.out.print("Choice level Employee!");
        viewChoiceLevel();
         level = choiceLevel(scanner.nextInt());
//        String level = scanner.next();4
        System.out.print("Choice Position Employee!");
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
