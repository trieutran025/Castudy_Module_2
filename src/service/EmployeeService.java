package src.service;

import src.models.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeService extends Service{
    List<Employee> findAll() throws IOException;
    void add(Employee employee) throws IOException;
    void set(Employee employee, String id) throws IOException;
}
