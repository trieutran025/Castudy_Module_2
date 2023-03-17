package src.repository.Impl;

import src.models.Employee;
import src.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("NV11", "Manh", "10/10/1989", "Nam", "123211233", "097847545610", "manh179@gmail.com", "KimCuong", "Chu Tinh", 42000000));
        employeeList.add(new Employee("NV22", "Hai", "10/4/1994", "Nam", "010103293", "097847545610", "hai123@gmail.com", "Bac", "PhoGiamDoc", 22000000));
        employeeList.add(new Employee("NV33", "Minh", "4/12/1991", "Nu", "0154949111", "097847545610", "minh1111@gmail.com", "Dong", "NhanVien", 12000000));
        employeeList.add(new Employee("NV44", "Toan", "23/10/1992", "Nam", "0104940113", "097847545610", "toan012@gmail.com", "Gold", "GiamDoc", 22000000));
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
