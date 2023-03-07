package src.service;

import src.models.Employee;
import src.repository.EmployeeRepository;
import src.repository.EmployeeRepositoryImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository repository =(EmployeeRepository) new EmployeeRepositoryImpl();
    @Override
    public List<Employee> findAll() {
        return repository.findAll();

    }

    @Override
    public void addEmployee(Employee employee) {
        repository.addEmployee(employee);
    }

    @Override
    public void setEmployee(String employeeCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary) {
        repository.setEmployee(employeeCode,name,birth,gender,identityCard,numberPhone,email,level,position,salary);
    }
}
