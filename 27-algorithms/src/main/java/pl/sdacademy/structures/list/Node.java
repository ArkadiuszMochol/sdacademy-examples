package pl.sdacademy.structures.list;

import pl.sdacademy.structures.User;

public class Node {

    private Node next;
    private User user;

    public Node(Node next, User user) {
        this.next = next;
        this.user = user;
    }

    public Node getNext() {
        return next;
    }

    public User getUser() {
        return user;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
