package src.service.Impl;

import src.models.Employee;
import src.repository.EmployeeRepository;
import src.repository.Impl.EmployeeRepositoryImpl;
import src.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository repository =(EmployeeRepository) new EmployeeRepositoryImpl();
    @Override
    public List<Employee> findAll() {
        return repository.findAll();

    }

    @Override
    public void add(Employee employee) {
        repository.add(employee);
    }

    @Override
    public void set(String employeeCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary) {
        repository.set(employeeCode,name,birth,gender,identityCard,numberPhone,email,level,position,salary);
    }
}
