import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list, new BuyuktenKucugeString());

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("**************************");

        ArrayList<Player> listPlayer = new ArrayList<>();
        listPlayer.add(new Player("Java", 0));
        listPlayer.add(new Player("C++", 2));
        listPlayer.add(new Player("Python", 8));
        listPlayer.add(new Player("Php", 22));
        listPlayer.add(new Player("Go", 15));

        // Collections.sort(listPlayer, new KucuktenBuyugePlayer());
        // Collections.sort(listPlayer, new BuyuktenKucugePlayer());
        // Collections.sort(listPlayer, new KucuktenBuyugeStringPlayer());

        // ANONIM CLASS ORNEGI!!
        Collections.sort(listPlayer, new Comparator<Player>() {

            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getIsim().compareTo(o2.getIsim());
            }

        });

        for (Player s : listPlayer) {
            System.out.println(s.getIsim());
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

}

class BuyuktenKucugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);
    }

}

class KucuktenBuyugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 15;
        }
        return 0;
    }

}

class BuyuktenKucugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if (o1.getId() > o2.getId()) {
            return -1;
        } else if (o1.getId() < o2.getId()) {
            return 15;
        }
        return 0;
    }

}

class KucuktenBuyugeStringPlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getIsim().compareTo(o2.getIsim());
    }

}