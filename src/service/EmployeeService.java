package src.service;

import src.models.Employee;

import java.util.List;

public interface EmployeeService extends Service{
    List<Employee> findAll();
    void addEmployee(Employee employee);
    void setEmployee(String employeeCode,String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary);
}
