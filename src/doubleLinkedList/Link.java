package doubleLinkedList;

public class Link {

    private int value;
    private Link next;
    private Link previous;
    //sarok elem, utolsó eleme a listának
    //határ a jelentése.
    private boolean bound;

    public Link(int value) {
        this.value = value;
    }

    public Link(boolean bound) {
        this.bound = bound;
        this.value = 0;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setPrevious(Link previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public boolean isBound() {
        return bound;
    }
}
