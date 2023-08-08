import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

    Random random = new Random();

    // İçinde max 10 değer olmasını istiyoruz.
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void produce() {

        while (true) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                Integer value = random.nextInt(100);
                System.out.println("Producer üretiyor: " + value);

                queue.put(value); // kendi içinde threadleri kullanır.
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void consume () {

        while(true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        Integer value = queue.take();
        
    }

}
