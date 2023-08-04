public class Main {
    public static void main(String[] args) {

        // I / O

        // Stream: verilerin input output yoluyla java projelerine aktığı bir veri
        // dizisidir.

        /*
         * System.out: Standart output stream.
         * System.err: Standart error stream.
         * System.in: Standart input stream.
         */

        /*
         * OutputStream
         * Java uygulamaları bir dosyaya, bir sockete ve bağlanmış bir aygıta veriyi
         * stream halinde yazmak için OutputStream abstract classından türeyen bir alt
         * sınıfı kullanır.
         * 
         * write() metodu: Belli bir btye dizisini veya tek bir byte'ı hedefe yazar.
         * flush() metodu: Herhangi bir bufferlanmış veri varsa bu metot sayesinde hemen
         * hedefe yazılmasını söylemiş oluyoruz.
         * close() metodu: OutpuStream'i kapatır.
         */

        /*
         * InputStream
         * Java uygulamaları bir dosyadan, bir socketten ve bağlanmış bir aygıttan
         * veriyi Stream halinde okumak için InputStream absract classından türeyen bir
         * alt sınıfı kullanır.
         * 
         * read() metodu: Kaynaktan bir sonraki byte'ı okur. Okuyacak herhangi bir byte
         * yoksa -1 değeri döner.
         * available() metodu: Okunabilecek byte sayısını döner.
         * close() metodu: InputStream'i kapatır.
         */

    }
}