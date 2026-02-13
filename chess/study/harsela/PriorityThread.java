package chess.study.harsela;
public class PriorityThread extends Thread {
    public synchronized void run() {
        System.out.println(getName() + " running with " + getPriority());
    }
    public static void main(String[] args) throws InterruptedException {
        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread h3 = new PriorityThread();
        PriorityThread h4 = new PriorityThread();

        t1.setName("Low");
        t2.setName("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        // t1.join();
        t2.start();
        h3.start();
        h4.run();
    }
}
