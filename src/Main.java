import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // SET interface ==> HashSet, LinkedHashSet, TreeSet

        // Set ile List interface arasındaki fark şu:
        // List bir elementten birkaç tane depolarken Set sadece bir tane depoluyor

        // Elementler HashSet içerisinde ekleme sırasına göre depolanmıyor.
        // LinkedHashSet elementleri ekleme sırasına göre depoluyor.
        // TreeSet elementleri Tree'ye göre yerleştiriyor yani alfabetik olarak
        // sıralanıyor.

        // HashSet'te elemanları tak diye bulabiliyoruz çünkü nerde oldukları hashing
        // mekanizmasından dolayı bellidir. Yani ekleme, çıkarma, arama metodları sabit
        // bir zamanda çalışır.

        // TreeSet'te içerisinde ne kadar çok element olursa ekleme, çıkarma, arama
        // metodları o kadar yavaş çalışır.

        // LinkedHashSet sınıfı hashtable ile linkedlist yapısını kullanarak elementleri
        // depolar. Bu yüzden ekleme sırasına göre depolanır. Ekleme, çıkarma, arama
        // metodları sabit bir zamanda çalışır(HashSet gibi).

        Set<String> set1 = new HashSet<>(); // Karışık depoladı
        Set<String> set2 = new LinkedHashSet<>(); // Sırasıyla depoladı
        Set<String> set3 = new TreeSet<>(); // Alfabetik depoladı

        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("Php");

        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("Php");

        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("Php");
        set3.add("Php"); // tekrar eklenmedi

        System.out.println("******HashSet**********");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("******LinkedHashSet**********");
        for (String s : set2) {
            System.out.println(s);
        }

        System.out.println("******TreeSet**********");
        for (String s : set3) {
            System.out.println(s);
        }

        /******************************************************************************* */
        System.out.println("*****************************************");

        Set<String> s1 = new HashSet<>();
        Set<String> s2 = new HashSet<>();

        s1.add("Java");
        s1.add("C++");
        s1.add("Python");
        s1.add("Javascript");
        s1.add("Php");

        s2.add("Go");
        s2.add("Java");
        s2.add("Css");

        Set<String> fark = new HashSet<>(s2); // fark kümesini s2'ye eşitler
        System.out.println(fark.removeAll(s1)); // fark içerisinden s1'e ait olan elemanları siliyor
        System.out.println(fark); // s2'ye ait olan özellikler tek kalıyor

        Set<String> kesisim = new HashSet<>(s2);
        System.out.println(kesisim.retainAll(s1)); // burda da iki kümenin kesişimi gerçekleşiyor
        System.out.println(kesisim);
    }
}
