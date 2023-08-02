import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list); // Alfabetik sıraya sokar

        for (String s : list) {
            System.out.println(s);
        }

        ArrayList<Player> listPlayer = new ArrayList<>();
        listPlayer.add(new Player("Samet", 1));
        listPlayer.add(new Player("Oğuz", 10));
        listPlayer.add(new Player("Yusuf", 4));

        // Collections.sort(listPlayer); bunu çalıştırabilmek için classta Comparable'yi
        // implement etmemiz gerekiyor.

        Collections.sort(listPlayer);
        for (Player p : listPlayer) {
            System.out.println(p.id + " " + p.isim);
        }

    }
}

class Player implements Comparable<Player> {
    String isim;
    int id;

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

}
