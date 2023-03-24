package src.models;

public class Employee extends Person {

    private String level;
    private String position;
    private long salary;

    public Employee(String level, String position, long salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String birth, String gender, String identityCard, String numberPhone, String email, String level, String position, long salary) {
        super(id, name, birth, gender, identityCard, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
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
                super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
