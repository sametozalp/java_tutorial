public class Main {
    public static void main(String[] args) {

        // MultiTasking
        // Birçok process'i aynı anda yapmak. (Chrome ile Spotify'ın aynı anda
        // çalışması)
        // Birçok uygulamayı aynı anda çalıştırmak.

        // MultiThreading
        // Bir process içinde birden fazla çalışma ünitesi oluşturmak. (Word'de yazı
        // yazarken aynı anda yazdıklarımızın word tarafından kontrol edilmesi)
        // Bir uygulamanın içinde birden fazla işlem yapmak.

        // Process
        // Bilgisayarda çalışabilecek her türlü uygulamadır.
        // Her process kendi bellek alanına sahiptir.
        // Java uygulamamızı çalıştırdığımızda bu uygulama JVM(Sanal Virtual Machine)
        // üzerinde çalışacak bir process'e dönüşür.
        // Java projeleri process'e dönüştükleri zaman kendi memory space'ini diğer
        // adıyla heap'ini oluşturur. (Bunların içinde oluşturduğumuz classlar,
        // değişkenler, metotlar var.)
        // Eğer elimizde 2 tane çalışır durumda uygulamamız (process'imiz) varsa bu
        // uygulamalar birbirlerinin bellek alanlarına veya heap'lerine erişemezler.

        // Thread
        // Bir process'in içinde bulunan bir çalışma ünitesidir ve her java programı en
        // az bir Thread'e sahiptir.
        // Main metodu çağırılırken bir main thread oluşturulur.
        // Thread'ler process'lerin içinde oluştuğu için process'lerin oluşturduğu
        // bellek alanlarına direkt olarak erişebilirler.
        // Ayrıca bellek alanından ayrı olarak her Thread'in sadece kendinin
        // erişebileceği bir thread stack'i bulunur.

        // Thread'lerin eş zamanlı olarak çalışmasına Concurrency (Eş zamanlılık) denir.

        // Thread'lerin çalışması
        // Birçok thread oluşturduğumuzda JVM ve işletim sistemi thread'lerin ne zaman
        // çalışacağını kendisi belirler.

        // thread1.start();
        // thread2.start();
        // thread3.start(); yazsak bile 2 - 3 - 1 şeklinde threadler çalışabilir.

    }
}
