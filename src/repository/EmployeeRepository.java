package src.repository;

import src.models.Employee;

import java.io.IOException;
import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll() throws IOException;

    void add(Employee employee) throws IOException;

    void set(Employee employee, String id) throws IOException;
    boolean checkId(String id) throws IOException;
}
