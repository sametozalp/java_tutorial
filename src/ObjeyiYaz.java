import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {

        // Serialization: Array ve Collention'ların serileştirilmesi

        Ogrenci ogrenci = new Ogrenci("Samet", 12456498, "Bilgisayar Mühendisliği");
        Ogrenci ogrenci2 = new Ogrenci("Oğuz", 45789456, "Finansal Matematik");
        Ogrenci ogrenci3 = new Ogrenci("Mehmet", 65484531, "Bilgisayar Mühendisliği");

        Ogrenci[] ogrenciArray = { ogrenci, ogrenci2, ogrenci3 };
        ArrayList<Ogrenci> ogrenciList = new ArrayList<>(Arrays.asList(ogrenciArray));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenciler.bin"))) {

            Ogrenci.setOgrenciSayisi(100);

            out.writeObject(ogrenciArray);
            out.writeObject(ogrenciList);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}