public class Main {
    public static void main(String[] args) {
        /*
         * Seyirci seyirci1 = new Seyirci("Samet Ozalp");
         * Seyirci seyirci2 = new Seyirci("Ahmet Ozalp");
         * 
         * seyirci1.oyunIzle();
         * seyirci2.oyunIzle();
         * 
         * System.out.println(Seyirci.getSeyirciSayisi()); // çalışmaz çünkü
         * fonksiyon static değil
         * System.out.println(seyirci1.getSeyirciSayisi());
         * System.out.println(seyirci2.getSeyirciSayisi());
         */

        // STATIC OLMAK ZORUNDADIR NEDEN
        // MAIN STATIC BIR FONKTUR YANI PROGRAM BASLADIĞI ANDA OLUSUR
        // AMA SELAMLA METOTU STATIC OLMAZSA PROGRAM BASLADIGINDA OLUSMAZ
        // YANI OLUSAN BIR METOTTAN OLUSMAYAN BIR METOT CAGIRIRSANIZ PROGRAM HATA VERIR
        selamla();

        //BU DURUMDA STATIC BIR METOTUN ICINDEN STATIC OLMAYAN BIR DEGISKEN DE CAGIRAMAYIZ

    }

    public static void selamla() {
        System.out.println("Selamlar..");
    }
}
