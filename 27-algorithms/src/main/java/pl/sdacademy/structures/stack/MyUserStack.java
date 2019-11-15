package pl.sdacademy.structures.stack;

import pl.sdacademy.structures.User;

public class MyUserStack {

    private User [] stackTable = new User[1000];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void push(User user) {
        stackTable[size] = user;
        size++;
    }

    public User pop() {
        if (size > 0) {
            User userToBeReturned = stackTable[size - 1];
            stackTable[size - 1] = null;
            size--;
            return userToBeReturned;
        } else {
            return null;
        }
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(stackTable[i]);
        }
    }

}
