public class Main {
    public static void main(String[] args) {

        // GENERICS: (<E>) kullanımıyla verimlilik sağlar

        Character[] charDizi = { 'J', 'A', 'V', 'A' };
        Integer[] integerDizi = { 1, 2, 3, 4, 5, 6 };
        String[] StringDizi = { "Java", "Python", "C++", "Php" };
        Ogrenci[] ogrenciDizi = { new Ogrenci("Samet"), new Ogrenci("Ahmet"), new Ogrenci("Mehmet") };
        /*
         * CharYazdir.yazdir(charDizi);
         * System.out.println("**********************");
         * IntegerYazdir.yazdir(integerDizi);
         * System.out.println("**********************");
         * StringYazdir.yazdir(StringDizi);
         * System.out.println("**********************");
         * OgrenciYazdir.yazdir(ogrenciDizi);
         */

        YazdirmaSinifi<Character> yazdirChar = new YazdirmaSinifi<>();
        YazdirmaSinifi<String> yazdirString = new YazdirmaSinifi<>();
        YazdirmaSinifi<Integer> yazdirInteger = new YazdirmaSinifi<>();
        YazdirmaSinifi<Ogrenci> yazdirOgrenci = new YazdirmaSinifi<>();

        yazdirChar.yazdir(charDizi);
        System.out.println("**********************");
        yazdirString.yazdir(StringDizi);
        System.out.println("**********************");
        yazdirInteger.yazdir(integerDizi);
        System.out.println("**********************");
        yazdirOgrenci.yazdir(ogrenciDizi);
        System.out.println("\n\n**********************");
        System.out.println("Obje oluşturmadan kullanmak daha mantıklı");
        System.out.println("**********************");
        new YazdirmaSinifi<>().yazdir(charDizi);
        new YazdirmaSinifi<>().yazdir(StringDizi);
        new YazdirmaSinifi<>().yazdir(ogrenciDizi);
    }
}