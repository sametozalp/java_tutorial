import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        // Try With Resource
        // Gereksiz try-catch kullanımını kaldırır.
        // Program sonunda kapatmamız gereken kaynakları kendiliğinden kapatır.
        // Java 7 ile gelmiştir.

        //Birden fazla dosya açmak istersek..
        try (FileWriter writer = new FileWriter("dosya.txt");
                FileWriter writer2 = new FileWriter("dosya2.txt")) {

            writer.write("deneme");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}