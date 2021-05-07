package linkedlistdemo;

public class CurrentListItem implements SampleForLinkedList {

    public int value;
    CurrentListItem next;

    public CurrentListItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CurrentListItem getNext() {
        return next;
    }

    public void setNext(CurrentListItem next) {
        this.next = next;
    }

    @Override
    public SampleForLinkedList next() {
        return this.getNext();
    }

}
