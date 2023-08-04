import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // FileWriter
        // FileOutputStream kullanırken dönüştürme işlemi yapmak zorunda kalıyoruz.
        // Bunun önüne geçer.

        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter("dosya.txt", true);
            // fileWriter.write("Ahmet Samet Özalp\n");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fileWriter != null)
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

    }
}