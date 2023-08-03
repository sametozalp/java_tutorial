import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // LISTITERATOR AND ITERATOR

        /*
         * Listiterator, SADECE List interfacesi implement eden classlarda kullanılır.
         * next() ve previous() metotları vardır.
         * ekstradan add() metotu bulunuur.
         * 
         * Iterator, set, queue, ve list interfacesi implement eden classlarda
         * kullanılır.
         * previous() metotu yoktur.
         */

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("*********************");

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("*****ITERATOR EN SONA GELDIGI ICIN BUNDAN SONRAKI WHILE DONGUSU CALISMIYOR*******");
        // ITERATOR EN SONA GELDIGI ICIN BUNDAN SONRAKI WHILE DONGUSU CALISMIYOR
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("*********************");

        /*****************************************************/

        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");
        list2.add("Go");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        // tersten yazdı
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // "Go" üzerine gelince sil
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if(value.equals("Go")) {
                listIterator.remove();
            }
        }

    }
}