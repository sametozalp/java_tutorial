import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjeyiYaz {
    public static void main(String[] args) {

        // Serialization: Objelerin serileştirilmesi

        /*
         * Avantaj:
         * Oyunu kaydettin kapatıp açınca bu sayede tutabilirsin.
         * Mesaj göndereceksin bu durumda state'i tutar karşı tarafa paslarsın
         * (veritabanı aracılığıyla)
         * Uzun bir işlemi bir kez yapar serilieştirdikten sonra her seferinde aynı
         * işlemi yapmaktan kurtuluruz.
         */

        // ObjectOutputStream, objeyi serileştirmek için kullanılır.
        // .bin, dosyanın binary (byte) şeklinde oluştuğunu gösterir.
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {

            Ogrenci ogrenci = new Ogrenci("Samet", 12456498, "Bilgisayar Mühendisliği");
            Ogrenci ogrenci2 = new Ogrenci("Oğuz", 45789456, "Finansal Matematik");

            out.writeObject(ogrenci);
            out.writeObject(ogrenci2);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}