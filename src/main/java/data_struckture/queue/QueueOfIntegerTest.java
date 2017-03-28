package data_struckture.queue;

public class QueueOfIntegerTest {
    public static void main(String[] args) {
        QueueOfInteger queueOfInteger = new QueueOfInteger(3);
        queueOfInteger.insert(1);
        queueOfInteger.insert(2);
        queueOfInteger.insert(3);
        System.out.println(queueOfInteger.getRear());
        queueOfInteger.remove();
        queueOfInteger.remove();
        System.out.println("rear - " + queueOfInteger.getRear() + ",front - " + queueOfInteger.getFront());
        queueOfInteger.insert(4);
        System.out.println("rear - " + queueOfInteger.getRear() + ",front - " + queueOfInteger.getFront());
        queueOfInteger.insert(5);
        System.out.println("rear - " + queueOfInteger.getRear() + ",front - " + queueOfInteger.getFront());
        System.out.println("front element is " + queueOfInteger.peekFront());
        queueOfInteger.insert(6);
        queueOfInteger.remove();
        queueOfInteger.remove();
        queueOfInteger.remove();
        System.out.println("rear - " + queueOfInteger.getRear() + ",front - " + queueOfInteger.getFront());
        System.out.println("front element is " + queueOfInteger.peekFront());
        queueOfInteger.remove();
        System.out.println("size is " + queueOfInteger.size());
    }
}
