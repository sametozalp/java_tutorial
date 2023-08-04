import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("dosya.txt");
            /*
             * // cast etmezsen ascii değerini getirir.
             * 
             * System.out.println((char) fis.read()); // J
             * System.out.println((char) fis.read()); // a
             * System.out.println((char) fis.read()); // v
             * 
             * // İmleç her seferinde ilerliyor.
             */
            /*
             * fis.skip(5); // imleç 5 kez hareket eder.
             * 
             * System.out.println((char)fis.read()); // P
             * System.out.println((char) fis.read()); // r
             */

            /*
             * // Dosyanın tamamını okumak
             * int deger;
             * String s = "";
             * 
             * while ((deger = fis.read()) != -1) {
             * s += (char) deger;
             * }
             * 
             * System.out.println("Dosya içeriği: " + s);
             */

            int deger;
            String s = "";
            int say = 0;

            fis.skip(5);
            while ((deger = fis.read()) != -1) {
                s += (char) deger;
                say++;
                if (say == 10) {
                    break;
                }
            }
            System.out.println("Dosyanın 5. yerinden itibaren 10 karakter: " + s);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}