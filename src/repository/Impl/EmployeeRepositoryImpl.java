package src.repository.Impl;

import src.models.Employee;
import src.repository.EmployeeRepository;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    public static final String FILE_PATH = "D:\\CodeGym\\module_2\\FurumaResort\\src\\data\\employee.csv";

    public static List<Employee> readCSV() throws IOException {
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);
        List<Employee> employeeList = new LinkedList<>();
        String line = "";
        String temp[];
        Employee employee;
        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String id = temp[0];
            String name = temp[1];
            String birth = temp[2];
            String gender = temp[3];
            String identityCard = temp[4];
            String numberPhone = temp[5];
            String email = temp[6];
            String level = temp[7];
            String position = temp[8];
            long salary = Long.parseLong(temp[9]);
            employee = new Employee(id, name, birth, gender, identityCard, numberPhone, email, level, position, salary);
            employeeList.add(employee);
        }
        buff.close();
        return employeeList;
    }

    public static void writeCSV(List<Employee> employees) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH);
        BufferedWriter buff = new BufferedWriter(fileWriter);
        for (Employee employee1 : employees) {
            buff.write(employee1.getId() + "," + employee1.getName() + "," + employee1.getBirth() + "," + employee1.getGender()
                    + "," + employee1.getIdentityCard() + "," + employee1.getNumberPhone() + "," + employee1.getEmail()
                    + "," + employee1.getLevel() + "," + employee1.getPosition() + "," + employee1.getSalary());
            buff.newLine();
        }
        buff.close();
    }

    @Override
    public List<Employee> findAll() throws IOException {
        return readCSV();
    }

    @Override
    public void add(Employee employee) throws IOException {
        List<Employee> employeeList = readCSV();
        employeeList.add(employee);
        writeCSV(employeeList);
    }

    @Override
    public void set(Employee employee, String id) throws IOException {
        List<Employee> employeeList = readCSV();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                employeeList.set(i, employee);
                break;
            }
        }
        writeCSV(employeeList);
    }

}

