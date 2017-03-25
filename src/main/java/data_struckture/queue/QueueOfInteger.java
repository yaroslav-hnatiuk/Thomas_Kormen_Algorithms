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
        if (rear < maxSize && rear < front) {
            array[++rear] = value;
            ++nElem;
        } else if (rear >= maxSize && front > 0) {
            rear = -1;
            array[++rear] = value;
            ++nElem;
        } else {
            System.out.println("Queue is full!!!");
        }
    }

    public int remove() {
        return 0;
    }

    public int peekFront() {
        if (nElem != 0)
            return array[front];
        else
            return 0;
    }
}
