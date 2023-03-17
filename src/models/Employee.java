package src.models;

public class Employee extends Person {
    private String employeeCode;
    private String level;
    private String position;
    private long salary;

    public Employee(String employeeCode, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary) {
        super(name, birth, gender, identityCard, numberPhone, email);
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Code='" + employeeCode + '\'' +
                "name='" + getName() + "\'" +
                "birth='" + getBirth() + "\'" +
                "gender='" + getGender() + "\'" +
                "identityCard='" + getIdentityCard() + "\'" +
                "numberPhone='" + getNumberPhone() + "\'" +
                "email='" + getEmail() + "\'" +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
