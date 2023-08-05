import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {

            // Objeleri sırasıyla almalıyız, almazsak objeler birbirine karışıyor.

            Ogrenci ogrenci = (Ogrenci) in.readObject();
            Ogrenci ogrenci2 = (Ogrenci) in.readObject();

            System.out.println("******************");
            System.out.println(ogrenci);
            System.out.println(ogrenci2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
