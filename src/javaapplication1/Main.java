package javaapplication1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
        ListIterator<String> iterator = gidilecekYerler.listIterator();

        // sırada biri var mı
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        LinkedList<String> gidilecekYerler = new LinkedList<>();
        gidilecekYerler.add("postane");
        gidilecekYerler.add("market");
        gidilecekYerler.add("Okul");
        gidilecekYerler.add("Kütüphane");
        gidilecekYerler.add("spor salonu");
        gidilecekYerler.add("Ev");

        listeyiBastir(gidilecekYerler);

        // İŞLEMLERDE KAYDIRMA OLMUYOR SADECE REFERANSLAR DEĞİŞİYOR
        gidilecekYerler.add(4, "Alışveriş merkezi");
        gidilecekYerler.remove(3);

        listeyiBastir(gidilecekYerler);
    }
}