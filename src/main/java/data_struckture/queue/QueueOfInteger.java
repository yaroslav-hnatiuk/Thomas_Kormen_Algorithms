package data_struckture.queue;

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
        if (nElem == maxSize) {
            System.out.println("Queue is full!!!");
        } else if (rear < maxSize - 1) {
            array[++rear] = value;
            ++nElem;
        } else if (rear >= maxSize - 1 && front > 0) {
            rear = -1;
            array[++rear] = value;
            ++nElem;
        }
    }

    public int remove() {
        if (nElem == 0){
            System.out.println("The queue is empty!!!");
            return 0;
        }
        if (front >= maxSize - 1) {
            int top = array[front];
            front = 0;
            nElem--;
            return top;
        }else {
            nElem--;
            return array[front++];
        }
    }

    public int peekFront() {
        if (nElem != 0)
            return array[front];
        else
            return 0;
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
