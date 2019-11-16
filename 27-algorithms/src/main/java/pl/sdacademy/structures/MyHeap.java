package pl.sdacademy.structures;

import java.util.Random;

public class MyHeap {

    int [] arr = new int[1000];
    int size = 0;

    public void push(int element) {
        int i = size;
        size++;
        int j = (i - 1) / 2;
        while(i > 0 && arr[j] < element) {
            arr[i] = arr[j];
            i = j;
            j = (i - 1) / 2;

        }
        arr[i] = element;
    }

    public int pop() {
        int i,j,v;
        int returnValue = -1;
        if(size > 0)
        {
            returnValue = arr[0];
            v = arr[size];

            i = 0;
            j = 1;

            while(j < size)
            {
                if(j + 1 < size && arr[j + 1] > arr[j]) j++;
                if(v >= arr[j]) break;
                arr[i] = arr[j];
                i = j;
                j = 2 * j + 1;
            }

            arr[i] = v;
            size--;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        MyHeap heap = new MyHeap();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int element = random.nextInt(100);
            heap.push(element);
        }
        int value = 0;
        while(value != -1) {
            value = heap.pop();
            System.out.println(value);
        }
    }
}
