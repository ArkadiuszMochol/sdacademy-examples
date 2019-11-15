package pl.sdacademy.structures.list;

import pl.sdacademy.structures.User;

public class MyUserList {

    private Node head = null;

    public void add(User user, int index) {
        Node newNode = new Node(null, user);
        if(index == 0) {
            if (head == null) {
                head = newNode;
            } else {
                newNode.setNext(head);
                head = newNode;
            }

        } else {
            int counter = 0;
            Node currentElement = head, previousElement = null;
            while (currentElement != null) {
                if (counter == index) {
                    previousElement.setNext(newNode);
                    newNode.setNext(currentElement);
                    return;
                } else {
                    previousElement = currentElement;
                    currentElement = currentElement.getNext();
                    counter++;
                }
            }
            previousElement.setNext(newNode);
            newNode.setNext(currentElement);
        }
    }

    public void remove(int index) {
        if (index == 0) {
            if (head != null) {
               head = head.getNext();
            }
        } else {
            int counter = 0;
            Node currentElement = head, previousElement = null;
            while (currentElement != null) {
                if (counter == index) {
                    previousElement.setNext(currentElement.getNext());
                    break;
                } else {
                    previousElement = currentElement;
                    currentElement = currentElement.getNext();
                    counter++;
                }
            }
        }

    }

    public User get(int index) {
        int counter = 0;
        Node currentElement = head;
        while(counter < index) {
            counter++;
            if(currentElement != null) {
                currentElement = currentElement.getNext();
            } else {
                throw new IndexOutOfBoundsException("Wyszedłeś poza ostatni element!");
            }
        }
        return currentElement.getUser();
    }


}
