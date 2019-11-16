package pl.sdacademy.structures;

import java.util.Objects;

public class User {

    public static final int MAX_OBJECT_COUNT = 100;
    private static int counter = 0;
    private long id;
    private String name;
    private String lastName;


    public User(long id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static User getUser(long id, String name, String lastName) {
        return new User(id, name, lastName);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }
}
