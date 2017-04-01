package data_struckture.linkedList;

public class Link {
    private TestData data;
    private Link next;

    public Link(TestData data) {
        this.data = data;
    }

    public TestData getData() {
        return data;
    }

    public void setData(TestData data) {
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }
}
