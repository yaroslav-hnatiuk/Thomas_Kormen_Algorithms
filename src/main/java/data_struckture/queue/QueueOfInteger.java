package data_struckture.queue;

import java.util.Optional;

public class QueueOfInteger {
    private Integer[] array;
    private int maxSize;
    private int nElem;
    private int rear;
    private int front;

    public QueueOfInteger(int maxSize) {
        this.maxSize = maxSize;
        array = new Integer[this.maxSize];
        front = 0;
        rear = -1;
        nElem = 0;
    }

    public void insert(int value) {
        if(!this.isQueueFull()) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            nElem++;
            array[++rear] = value;
        }else{
            System.out.println("The queue is full.");
        }
    }

    public Optional remove() {
        if(!this.isQueueEmpty()) {
            int value = array[front];
            if (front == maxSize - 1) {
                front = -1;
            }
            nElem--;
            front++;
            return Optional.of(value);
        }else{
            System.out.println("The queue is empty.");
            return Optional.empty();
        }
    }

    public int peekFront() {
        return array[front];
    }

    boolean isQueueEmpty() {
        return nElem <= 0;
    }

    boolean isQueueFull(){
        return nElem == maxSize;
    }

    public int getNElem() {
        return nElem;
    }

    public int size() {
        return nElem;
    }

    public int getRear() {
        return rear;
    }

    public int getFront() {
        return front;
    }
}
