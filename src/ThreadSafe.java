public class ThreadSafe {
    private int count = 0;

    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.threadleriCalistir();

    }

    public void threadleriCalistir() {
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }

        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();
                }
            }

        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join(); // bizi bekle programa sonra devam et demektir.
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // threadler bitmeden çalışır, bu yüzden join() kullanmalıyız.
        System.out.println("Count değişkeninin değeri: " + count);

        // burada 10000 görmemiz gerekirken iki threadin de aynı değişkene senkron
        // sorununa yol açıyor ve 10000 değerini bazen göremiyoruz.

        // Metot oluşturup başına synchronized kelimesini yerleştirirsek aşağıdaki metot
        // gibi, bir threadin işi bitene kadar diğer thread içeri giremez.
    }

    public synchronized void arttir() {
        count++;
    }
}
