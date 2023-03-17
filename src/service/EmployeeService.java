package src.service;

import src.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{
    List<Employee> findAll();
    void add(Employee employee);
    void set(String employeeCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary);
}
