package pl.sdacademy.structures.heap;

import java.util.Random;

public class MyIntegerHeapTest {
    public static void main(String[] args) {
        MyIntegerHeap heap = new MyIntegerHeap();
        int [] realPushOrder = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int randomValue = random.nextInt(100);
            heap.push(randomValue);
            realPushOrder[i] = randomValue;
        }
        System.out.println("Wartości w prawdziwej kolejności:");
        for (int i = 0; i < realPushOrder.length; i++) {
            String value = String.valueOf(realPushOrder[i]);
            System.out.print(value + ", ");
        }
        System.out.println();
        System.out.println("Wartości posortowane przez kopiec:");
        int size = heap.getSize();
        for (int i = 0; i < size; i++) {
            int currentBiggestValue = heap.pop();
            String currentBiggestValueAsString = String.valueOf(currentBiggestValue);
            System.out.print(currentBiggestValueAsString + ", ");
        }
    }
}
