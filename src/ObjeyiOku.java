import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenciler.bin"))) {

            Ogrenci[] ogrenciArray = (Ogrenci[]) in.readObject();
            ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>) in.readObject();

            System.out.println("********************");
            for (Ogrenci o : ogrenciArray) {
                System.out.println(o);
                System.out.println("********************");
            }
            System.out.println("********************");

            for (Ogrenci o : ogrenciList) {
                System.out.println(o);
                System.out.println("********************");
            }
            System.out.println("********************");

            System.out.println("Öğrenci Sayısı: " + Ogrenci.getOgrenciSayisi());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
