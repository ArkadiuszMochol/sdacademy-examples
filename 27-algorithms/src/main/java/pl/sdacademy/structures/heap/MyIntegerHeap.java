package pl.sdacademy.structures.heap;

public class MyIntegerHeap {

    private int [] heapArray = new int [1000000];
    private int size;

    public void push(int element) {
        int currentParentIdx, currentChildIdx;
        currentParentIdx = size;
        size++;
        currentChildIdx = (currentParentIdx - 1) / 2;
        while (currentParentIdx > 0 && heapArray[currentChildIdx] < element) {
            heapArray[currentParentIdx] = heapArray[currentChildIdx];
            currentParentIdx = currentChildIdx;
            currentChildIdx = (currentParentIdx - 1) / 2;
        }
        heapArray[currentParentIdx] = element;
    }

    public int pop() {
        int i = 0 , j = 1, minElem, returnedElement;
        if (size > 0) {
            returnedElement = heapArray[0];
            size--;
            minElem = heapArray[size];
            while (j < size) {
                if ((j + 1 < size) && (heapArray[j + 1] > heapArray[j])) {
                    j++;
                }
                if (minElem >= heapArray[j]) {
                    break;
                }
                heapArray[i] = heapArray[j];
                i = j;
                j = 2 * j + 1;
            }
            heapArray[i] = minElem;
        } else {
            throw new IndexOutOfBoundsException("Kopiec jest pusty!!");
        }
        return returnedElement;
    }

    public int getSize() {
        return size;
    }
}
