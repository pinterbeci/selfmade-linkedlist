package linkedlistdemo;

//kivételek lekezelése


public class MyLinkedList {

    CurrentListItem first;

    public void addNewElemenent(int number) {

        if (first == null) {
            first = new CurrentListItem(number);
        } else {

            CurrentListItem currentItem = first;

            while (currentItem.getNext() != null) {
                currentItem = currentItem.getNext();
            }

            currentItem.setNext(new CurrentListItem(number));
        }

    }

    public void print() {

        CurrentListItem currentItem = first;
        String returnValue = "";

        while (currentItem != null) {
            returnValue += currentItem.getValue() + " ";
            currentItem = currentItem.getNext();
        }
        System.out.println(returnValue);
    }

    public int myListSize() {

        int size = 0;

        CurrentListItem currentItem = first;
        while (currentItem != null) {

            currentItem = currentItem.getNext();
            size++;
        }
        return size;
    }


    public CurrentListItem getElement(int index) {

        int countItem = 0 ;
        CurrentListItem currentItem = first;
        while (currentItem != null) {

            if( countItem == index && (index >=0 && index <= this.myListSize()) ){
                return currentItem;
            }

            currentItem = currentItem.getNext();
            countItem++;
        }

       return null;
    }

    public void addNewItemToStartOfList(int numberToTheStart){

        if( first == null ){

            first = new CurrentListItem(numberToTheStart);
            System.out.println("A lista első eleme : " + first.getValue() );
            System.out.println("Az első elem -> " + first.getNext());
            System.out.println("______________");
        }else{

            CurrentListItem newItem = new CurrentListItem(numberToTheStart);

            CurrentListItem second = first;
            first = newItem;
            newItem.setNext(second);
            System.out.println("Hozzááadjuk a(z) " + numberToTheStart + "-t a listához:" );
            System.out.println("newItem -> " + newItem.getNext() + " (" + newItem.getValue() + ")");
            System.out.println("first -> " + first.getNext() + " (" + first.getValue() + ")") ;
            System.out.println("second -> " + second.getNext() + " (" + second.getValue() + ")");

            System.out.println("______________");


        }

    }

    public void delete( int number){
        CurrentListItem currentItem = first ;
        CurrentListItem previousItem = currentItem;

        while ( currentItem != null ){
            if( currentItem.getValue() == number ){
                if( currentItem == first){
                    first = currentItem.getNext();
                }
                else {
                    previousItem.setNext(currentItem.getNext());
                }
                break;
            }
            previousItem = currentItem;
            currentItem = currentItem.getNext();

            //mivel a ciklus változót itt növeljük, így elmentve a növelés előtti értékét,
            // meg tudjuk határozni az előző értékét
        }
    }

    public boolean contains (int number ){

        CurrentListItem currentItem = first;

        while (currentItem.getNext() != null) {

            if( currentItem.getValue() == number){
                return true;
            }
            currentItem = currentItem.getNext();
        }


        return false;
    }

}
