import java.util.PriorityQueue;
import java.util.Queue;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {

        // PriorityQueue

        // PriorityQueue, queue mantığu gibi çalışmaz. Elemanlar öncelik sırasına göre
        // öncelik kazanıp sıraya geçiyor.

        // Integerlarda öncelik: küçük sayıdan büyük sayıya.
        // Stringlerde öncelik: sözlük sırası (alfabetik).

        // add() - offer()
        // clear()
        // constains(Object o)
        // peek()
        // poll()
        // size()

        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);

        System.out.println(queue.peek()); // kuyruğun en başındaki eleman

        // BİZ BUNLARI BASTIRIRKEN ÖNCELİK SIRASINA GÖRE GÖREMİYORUZ FAKAT ÖNCELİK
        // SIRASINA GÖRE SIRALI OLDUĞUNU BİLMEMİZ GEREKİYOR.

        while (!queue.isEmpty()) {
            System.out.println("Eleman çıkarılıyor: " + queue.poll());
        }

        // KENDİ OBJENİ SIRALA
        Queue<Player> players = new PriorityQueue<>();
        players.offer(new Player("Samet", 5));
        players.offer(new Player("Mehmet", 1));
        players.offer(new Player("Ahmet", 100));

        while (!players.isEmpty()) {
            System.out.println("Eleman çıkarılıyor: " + players.poll());
        }

    }
}

class Player implements Comparable<Player> {
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player [isim=" + isim + ", id=" + id + "]";
    }

}