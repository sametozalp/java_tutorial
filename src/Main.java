import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // VECTOR

        // synchronized: farklı threadler bir arraylist üzerinde uğraşıyorsa ve metot
        // synchronized değilse threadler karışıklığa neden oluyor. Biz burda vector
        // kullanırsak bir metot bir threadi çalıştırır ve karışıklığa neden olmaz.

        // Vectorler threadlerde oldukça güvenli fakat arraylistlere göre performansı
        // yavaş.

        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        for (String s : vector) {
            System.out.println(s);
        }

        /***********************************************************/

        ListIterator<String> iterator = vector.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /************************************************************/

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("İlk eleman: " + vector.firstElement());
        System.out.println("Son eleman: " + vector.lastElement());

        // STACK
        Stack<String> stack = new Stack<>(); // Vectorden extend ediyor

        stack.push("Python"); // stack.add("Python");
        stack.push("Java");
        stack.push("Php");
        stack.push("Go");

        for (String s : stack) {
            System.out.println(s);
        }

        // veya

        Enumeration<String> enumeration2 = stack.elements();
        while (enumeration2.hasMoreElements()) {
            System.out.println(enumeration2.nextElement());
        }

        System.out.println(stack.peek()); // STACK'IN SON ELEMANINI ALIR
        stack.pop(); // Son elemanı stackten çıkarır
        

    }
}
