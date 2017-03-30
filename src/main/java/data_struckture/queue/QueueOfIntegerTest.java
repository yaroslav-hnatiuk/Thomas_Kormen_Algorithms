package data_struckture.queue;

public class QueueOfIntegerTest {
    public static void main(String[] args) {
        QueueOfInteger queueOfInteger = new QueueOfInteger(3);
        queueOfInteger.insert(1);
        queueOfInteger.insert(2);
        queueOfInteger.insert(3);

        System.out.println("last element " + queueOfInteger.remove().get());
        System.out.println("last element " + queueOfInteger.remove().get());
        System.out.println("last element " + queueOfInteger.remove().get());
        queueOfInteger.insert(4);
        System.out.println("last element " + queueOfInteger.remove().get());
    }
}
