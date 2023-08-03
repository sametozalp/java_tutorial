import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // QUEUE: KUYRUK (Interface)
        // Linkedlist ve PriorityQueue bu interfaceden implement eden somut
        // classlardır.
        // Kuyruğa ilk giren ilk çıkar. (Stack'in zıttı.)
        // offer add'den daha güvenli bir metot (eleman ekler).
        // remove() => kuyruğun en başındaki eleman kuyruktan çıkar. kuyruk boşsa hata
        // verir.
        // poll() => kuyruğun en başındaki eleman kuyruktan çıkar. kuyruk boşsa null
        // döner.
        // element() => kuyruğun en başındaki elemanı döner. kuyruk boşsa hata fırlatır.
        // peek() => kuyruğun en başındaki elemanı döner. kuyruk boşsa null döner.

        Queue<String> queue = new LinkedList<>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        System.out.println(queue.peek()); // kuyruğun en başındaki eleman
        System.out.println(queue.poll()); // kuyruğun en başındaki elemanı siler

        System.out.println("***************************");

        for (String s : queue) {
            System.out.println(s);
        }

        
    }
}
