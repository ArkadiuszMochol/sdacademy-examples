package pl.sdacademy.structures;

import pl.sdacademy.structures.User;

public class AdminUser extends User {

    private String rootPrivileges;

    public AdminUser(long id, String name, String lastName, String rootPrivileges) {
        super(id, name, lastName);
        this.rootPrivileges = rootPrivileges;
    }

    public String getRootPrivileges() {
        return rootPrivileges;
    }

    public void introduceYourself() {
        System.out.println(String.format("Imie: %s, nazwisko: %s, wiek: %d, uprawnienia: %s",
                getName(), getLastName(), getId(), getRootPrivileges()));
    }
}
