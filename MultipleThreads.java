import java.util.concurrent.atomic.AtomicInteger;

public class MultipleThreads {

    public static void main(String[] args) throws InterruptedException {

        int threads = 5;

        ThreadFactoryExample[] threadFactoryExample = new ThreadFactoryExample[threads];
        Counter counter = new Counter();

        for (int i = 0; i < threads; i++) {
            threadFactoryExample[i] = new ThreadFactoryExample(counter);
            threadFactoryExample[i].start();
            threadFactoryExample[i].join();
        }

        System.out.println("finished! with: "+ counter.count.get());
    }
}

class ThreadFactoryExample extends Thread {

    Counter counter;

    public ThreadFactoryExample(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            counter.count.addAndGet(1);
        }
        System.out.println(counter.count.get());
    }
}

class Counter {

    AtomicInteger count = new AtomicInteger(0);

//    int count = 0;
//
//    public synchronized void count() {
//        this.count++;
//    }
//
//    public int getCount() {
//        return count;
//    }
}
