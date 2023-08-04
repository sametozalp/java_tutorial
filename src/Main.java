import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        // File file = new File("dosya.txt");
        try {

            // burdaki true değeri SetOptions.merge ile aynı mantık çalışır
            fos = new FileOutputStream("dosya.txt", true);

            // fos.write(65); harf yazar

            //byte[] array = { 101, 75, 75, 66, 68 };
            //fos.write(array); // harfler olarak yazar

            String s = "Samet Özalp";
            fos.write(s.getBytes());

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}