package doubleLinkedList;

public class DoublyLinkedList implements IntList {

    //azért kapják meg a sarokelem beskatújázást,
    //mivel sarkai/határai lesznek a listának.

    private Link first = new Link(true);
    private Link last = new Link(true);


    public DoublyLinkedList() {

        //egymásra mutatnak
        //kiindulási pont, hogy az első elem előzője és az utolsó elem következője is a 'null'-ra mutat
        // ez lesz a kiindulási állapot, a default state. :)
        first.setNext(last);
        last.setPrevious(first);
    }

    @Override
    public boolean contains(int number) {

        //itt a második elemtől indulunk, mivel ugye az első elemünk egy referencia elem
        Link current = first.getNext();

        while (!(current.isBound())) {

            if (current.getValue() == number) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    /*
     *  F - 5 - 8 - 4 - L
     * Így képzeljünk el egy duplán láncolt listát.
     * A First és a Last jelzik a bound elemeket.
     * itt már beletettem bizonyos elemeket szemléltetés szempontjából.
     * */
    @Override
    public boolean add(int number) {

        boolean isAlreadyContains = this.contains(number);


        /*
         *   F - 5 - 8 - 4 - L
         *  Beszeretnénk szúrni a 10-es elemet.
         *   F - 10 - 5 - 8 - 4 - L
         * */

        /*
         * létrehozzuk a 10-es elemet.
         * aztán beállítjuk a mutatóit.
         * a 10-es előzője a F-re mutat majd, míg a következőjét "átveszi" az F-től,
         * azaz az F következő elemre mutatóját kapja meg.
         * NA DE, mivel esetünkben az 5-ös elem került beszúrásra, ezért
         * az ötös elem előzőre való mutatóját át kell állítani a 10-esre:
         * tehát ' first.getNext()' hivatkozunk az 5-ös elemünkre és neki a 'setPrevious()' metódusának segítségével
         * megadjuk az első elemünket, és így ez rendben van.
         * Egy dolog maradt, hogy az első elem 'setNext()' metódusának meghívásával megadjuk az új elemünket
         * és így helyére is került a 10-es elem! :)
         * */
        Link newLink = new Link(number);
        newLink.setPrevious(first);
        newLink.setNext(first.getNext());
        first.getNext().setPrevious(newLink);
        first.setNext(newLink);

        //még nincs benne, azaz hozzá lehet adni egy új elemet!
        return !isAlreadyContains;
    }

    @Override
    public void delete(int number) {

        //ez a metódus minden előfordulását kitörli az adott elemnek
        Link current = first.getNext();

        while (!current.isBound()) {

            //mivel, míg nem érjük el a 'bound' elemet, addig kitörli az
            // összes előfordulását az adott elemnek

            if (current.getValue() == number) {

                current.getNext().setPrevious(current.getPrevious());
                current.getPrevious().setNext(current.getNext());
            }

            current = current.getNext();
        }
    }

    @Override
    public String getElementsAsString() {

        StringBuilder sb = new StringBuilder();
        Link current = first.getNext();

        while (!current.isBound()) {

            if (first.getNext() != current) {
                sb.append(" - ");
            }
            sb.append(current.getValue());
            current = current.getNext();
        }

        return sb.toString();
    }
}
