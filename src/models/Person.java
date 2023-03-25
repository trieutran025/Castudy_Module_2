package src.models;

import java.util.Objects;

public abstract class Person implements Comparable<Person>{
    private String id;
    private String name;
    private String birth;
    private String gender;
    private String identityCard;
    private String numberPhone;
    private String email;


    public Person() {
    }

    public Person(String id, String name, String birth, String gender, String identityCard, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId().equals(person.getId()) && Objects.equals(getName(), person.getName()) && Objects.equals(getBirth(), person.getBirth()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getIdentityCard(), person.getIdentityCard()) && Objects.equals(getNumberPhone(), person.getNumberPhone()) && Objects.equals(getEmail(), person.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.id.compareTo(o.getId());
    }
}
