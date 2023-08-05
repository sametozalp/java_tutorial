import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // FileReader dosyaya gidip bir karakter alıp geri dönüyor her seferinde.
        // BufferedReader ise kendi içinde bir küme oluşturup toplayıp geliyor.

        // BufferedReader kullanmak için önce FileReader oluştururuz. İçine göndeririz.
        // Scanner'ın da içine BufferedReader göndeririz.

        // tryWithResources
        try (FileReader reader = new FileReader("ogrenciler.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                Scanner scanner = new Scanner(bufferedReader)) {

            // Scanner(System.in) => konsoldan alır
            // Scanner(new FileReader("ogrenciler.txt")) => dosyadan alır

            while (scanner.hasNextLine()) {
                // System.out.println("Okunan Satır: " + scanner.nextLine());

                String ogrenciBilgisi = scanner.nextLine();
                String[] array = ogrenciBilgisi.split(",");
                if (array[1].equals(" " + "Bilgisayar Mühendisliği")) {
                    System.out.println("Öğrenci bilgisi: " + ogrenciBilgisi);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}