package chess.study.harsela;
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + ": " + count);
    }
}
public class Sync {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            counter.increment();
            counter.increment();
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            counter.increment();
            counter.increment();
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}

