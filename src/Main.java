import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // tryWithResources
        try (FileReader reader = new FileReader("ogrenciler.txt");
                Scanner scanner = new Scanner(reader)) {

            // Scanner(System.in) => konsoldan alır
            // Scanner(new FileReader("ogrenciler.txt")) => dosyadan alır

            while (scanner.hasNextLine()) {
                //System.out.println("Okunan Satır: " + scanner.nextLine());

                String ogrenciBilgisi = scanner.nextLine();
                String[] array = ogrenciBilgisi.split(",");
                if(array[1].equals(" " + "Bilgisayar Mühendisliği")){
                    System.out.println("Öğrenci bilgisi: " + ogrenciBilgisi);
                }
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}