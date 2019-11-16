package pl.sdacademy.exercises.datingapp;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String lastName;
    private boolean isFemale;
    private int age;
    private List<String> interests;

    public User(String name, String lastName, boolean isFemale, int age, List<String> interests) {
        this.name = name;
        this.lastName = lastName;
        this.isFemale = isFemale;
        this.age = age;
        this.interests = interests;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public int getAge() {
        return age;
    }

    public List<String> getInterests() {
        return interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isFemale=" + isFemale +
                ", age=" + age +
                ", interests=" + interests +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isFemale == user.isFemale &&
                age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(interests, user.interests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, isFemale, age, interests);
    }
}
