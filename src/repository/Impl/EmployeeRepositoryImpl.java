package src.repository.Impl;

import src.models.Employee;
import src.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final List<Employee> employeeList;

    static {
        employeeList = new LinkedList<>();
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employeeList);
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void set(String employeeCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary) {
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
