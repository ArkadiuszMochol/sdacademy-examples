package pl.sdacademy.structures.list;

import pl.sdacademy.structures.User;

public class MyUserListTest {

    public static void main(String[] args) {
        MyUserList userList = new MyUserList();
        userList.add(new User(1, "Andrzej", "Anduła"), 0);
        userList.add(new User(2, "Beata", "Bomba"), 1);
        userList.add(new User(3, "Celina", "Cwaniak"), 1);
        userList.add(new User(4, "Darek", "Otwórz"), 3);

        userList.remove(1);
        for (int i = 0; i < 3; i++) {
            System.out.println(userList.get(i));
        }
    }

}
