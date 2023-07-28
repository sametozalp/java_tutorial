public class Main {
    public static void main(String[] args) {

        // ANONIM INNER CLASSES
        // interface ve abstract sınıfların metotlarına erişebilmek için anonim inner
        // classları kullanıyoruz
        // böylece herhangi bir class tanımlamasına gerek kalmıyor.

        IOgrenci ogrenci = new IOgrenci() {

            @Override
            public void dersCalis() {
                System.out.println("ders calisiyorum");
            }

            @Override
            public void derseGir() {
                System.out.println("derse giriyorum");
            }

        };
        ogrenci.dersCalis();
        ogrenci.derseGir();

        System.out.println("*******************************");

        AOgrenci aOgrenci = new AOgrenci("Samet Özalp", 171) {

            @Override
            void kayitYaptir() {
                System.out.println("kayit yapiliyor.. " + "İsim: " + getIsim() + " Numara: " + getNumara());
            }

        };

        aOgrenci.kayitYaptir();
        aOgrenci.selamla();

    }

    // ABSTRACT SINIFINI STATIC YAPMAZSAK YUKARIDA KULLANAMAYIZ
    // çünkü interface gibi değil içerisinde yazılmış metotlar bulunmakta
    // kullanabilmek için static olarak tanımlamalıyız

    public static abstract class AOgrenci {
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        abstract void kayitYaptir();

        public void selamla() {
            System.out.println("Selamlar..");
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
    }

    public interface IOgrenci {
        void dersCalis();

        void derseGir();
    }
}
