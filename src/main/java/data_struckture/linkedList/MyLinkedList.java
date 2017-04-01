package data_struckture.linkedList;

public class MyLinkedList {
    private Link first;

    public MyLinkedList() {
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(TestData data){
        Link link = new Link(data);
        link.setNext(first);
        first = link;
    }

    public Link deleteFirst(){
        Link temp = first;
        first = first.getNext();
        return temp;
    }
}
