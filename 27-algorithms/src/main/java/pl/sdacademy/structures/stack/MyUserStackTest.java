package pl.sdacademy.structures.stack;

import pl.sdacademy.structures.User;

public class MyUserStackTest {

    public static void main(String[] args) {
        MyUserStack userStack = new MyUserStack();
        userStack.push(new User(1, "Andrzej", "Anduła"));
        userStack.push(new User(2, "Beata", "Bomba"));
        userStack.push(new User(3, "Celina", "Cwaniak"));
        userStack.push(new User(4, "Darek", "Otwórz"));

        System.out.println("Oryginalny stos: ");
        userStack.printStack();

        MyUserStack userStackReversed = new MyUserStack();
        int size = userStack.getSize();
        for (int i = 0; i < size; i++) {
            userStackReversed.push(userStack.pop());
        }
        System.out.println("Odwrócony stos: ");
        userStackReversed.printStack();
        System.out.println("A teraz oryginalny stos:");
        userStack.printStack();


    }

}
