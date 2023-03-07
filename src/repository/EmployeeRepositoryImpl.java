package src.repository;

import src.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeList);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void setEmployee(String employeeCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary) {
        for (Employee employee : employeeList) {
            if (employeeCode.equals(employee.getEmployeeCode())) {
                employee.setName(name);
                employee.setBirth(birth);
                employee.setGender(gender);
                employee.setIdentityCard(identityCard);
                employee.setNumberPhone(numberPhone);
                employee.setEmail(email);
                employee.setLevel(level);
                employee.setPosition(position);
                employee.setSalary(salary);
            }
        }
    }
}
