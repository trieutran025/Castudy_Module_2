package src.service.Impl;

import src.models.Employee;
import src.repository.EmployeeRepository;
import src.repository.Impl.EmployeeRepositoryImpl;
import src.service.EmployeeService;

import java.io.IOException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository repository =(EmployeeRepository) new EmployeeRepositoryImpl();
    @Override
    public List<Employee> findAll() throws IOException {
        return repository.findAll();

    }

    @Override
    public void add(Employee employee) throws IOException {
        repository.add(employee);
    }

    @Override
    public void set(Employee employee, String id) throws IOException {
        repository.set(employee,id);
    }


}
