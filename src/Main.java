public class Main {
    public static void main(String[] args) {

        // GENERICS: (<E>) kullanımıyla verimlilik sağlar
        /*
         * Character[] charDizi = { 'J', 'A', 'V', 'A' };
         * Integer[] integerDizi = { 1, 2, 3, 4, 5, 6 };
         * String[] StringDizi = { "Java", "Python", "C++", "Php" };
         * Ogrenci[] ogrenciDizi = { new Ogrenci("Samet"), new Ogrenci("Ahmet"), new
         * Ogrenci("Mehmet") };
         * 
         * yazdir(charDizi);
         * yazdir(StringDizi);
         * yazdir(integerDizi);
         * yazdir(ogrenciDizi);
         * }
         * 
         * public static <E> void yazdir(E[] dizi) {
         * for (E e : dizi)
         * System.out.println(e);
         */

        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(25, 35, 2, 35);
        Sayisal birinci = birinci(sayisal1, sayisal2);

        Tm tm1 = new Tm(30, 20, 40, 2);
        Tm tm2 = new Tm(40, 10, 0, 50);
        Tm birinci2 = birinci(tm1, tm2);
        System.out.println("Birinci sayısal öğrencinin puanı: " + birinci.puanHesapla());
        System.out.println("Birinci eşit ağırlık öğrencinin puanı: " + birinci2.puanHesapla());
    }

    public static <E extends Aday> E birinci(E e1, E e2) {
        if (e1.puanHesapla() > e2.puanHesapla()) {
            return e1;
        } else {
            return e2;
        }
    }
}