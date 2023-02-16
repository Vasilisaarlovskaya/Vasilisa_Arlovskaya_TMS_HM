package lesson_20;

public class Person {
    private String name;
    private String surname;
    private String gender;
    private int age;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String surname, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return this.name + this.surname + this.gender + this.age;
    }
}