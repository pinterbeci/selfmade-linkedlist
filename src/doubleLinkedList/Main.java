package doubleLinkedList;

public class Main {
    public static void main(String[] args) {

        IntList list = new DoublyLinkedList();
        list.add(55);
        list.add(8);
        list.add(96);
        list.add(3);
        list.add(12);
        list.add(55);

        System.out.println(list.getElementsAsString());
        list.delete(55);
        System.out.println(list.getElementsAsString());
        list.add(91);
        System.out.println(list.getElementsAsString());


    }
}
