import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Thread Havuzları ve Executer Service
        // 100 threadimiz varsa her threadi kontrol etmek zor oluyor. İki ya da üç tane
        // thread aynı anda çalışsın şeklinde bir şey söyleyebliyoruz. Hatta bunun
        // kontrolünü tek tek kendimiz yapmak yerine Executer Service'e veriyoruz.

        // En fazla iki thread olacak şekilde çalışır.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            // Artık executerservice threadleri kendisi kontrol edecek.
            executorService.submit(new Worker(String.valueOf(i + 1), i + 1));
        }

        // Shutdown, dediğimizde başka iş atamayacağımız anlamına geliyor.
        // Ve işler bitene kadar devam et bittikten sonra kendini kapat anlamına gelir.
        // Shutdownı hiç yazmazsak main metodu hiçbir zaman sonlanmayacak.
        executorService.shutdown();

        try {
            // awaitTermination, bir ExecutorService nesnesinin belirli bir süre boyunca
            // beklemesini ve yönettiği görevlerin tamamlanmasını beklemesini sağlayan bir
            // yöntemdir.
            // Main metodumuz bir günü aştıktan sonra mutlaka bitsin demiş oluyoruz.
            // Burayı bekliyor. Bir günden erken biterse kodlardan devam ediyor.
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Bütün işler bitti..");

        /*
         * Thread t1 = new Thread(new Worker("1", 1));
         * Thread t2 = new Thread(new Worker("2", 2));
         * Thread t3 = new Thread(new Worker("3", 3));
         * Thread t4 = new Thread(new Worker("4", 4));
         * Thread t5 = new Thread(new Worker("5", 5));
         * System.out.println("Bütün işler teslim edildi.");
         * t1.start();
         * t2.start();
         * 
         * try {
         * t1.join();
         * t2.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         * 
         * t3.start();
         * t4.start();
         * 
         * try {
         * t3.join();
         * t4.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         * 
         * t5.start();
         * 
         * try {
         * t5.join();
         * } catch (InterruptedException e) {
         * // TODO Auto-generated catch block
         * e.printStackTrace();
         * }
         */
    }
}
