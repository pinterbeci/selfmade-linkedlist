package linkedlistdemo;

public class Main {

    public static void main(String[] args) {

        /*
        * A listaelemkre való hivatkozás, az adott példányok egyéni azonosítója alapján történik.
        * Úgy van az összekapcsolás, egyedül az utolsó elem esetében van hivatkozás a 'null', azaz nincs több elem
        * a listában. Így történt az "összekapcsolás" megvalósítása.
        * */
        MyLinkedList numbers = new MyLinkedList();

        numbers.addNewElemenent(6);
        numbers.addNewElemenent(10);
        numbers.addNewElemenent(96);
        numbers.addNewElemenent(30);
        numbers.addNewElemenent(7);
        numbers.addNewElemenent(56);
        numbers.addNewElemenent(66);

        System.out.println("A lista végére való beszúrás esetén a lista a következőként fest: ");
        numbers.print();
        System.out.println( "A listám mérete = " + numbers.myListSize());

        //System.out.println(numbers.getElement(6).getValue());

        MyLinkedList numbers2 = new MyLinkedList();

        numbers2.addNewItemToStartOfList(0);
        numbers2.addNewItemToStartOfList(40);
        numbers2.addNewItemToStartOfList(4);
        numbers2.addNewItemToStartOfList(11);

        System.out.println("A lista eléjére való beszúrás esetén a lista a következőként fest: ");
        numbers2.print();

        System.out.println("Törlés megvalósítása:");
        numbers2.delete(40);
        numbers2.print();
        numbers2.addNewElemenent(40);


        numbers2.print();

        numbers2.delete(11);
        numbers2.print();

        System.out.println(numbers2.contains(4));

    }
}
