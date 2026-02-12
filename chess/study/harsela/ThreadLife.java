package chess.study.harsela;

class ThreadLife extends Thread {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            System.out.println("Thread state");
        }
    }

    public static void main(String[] args) {
        ThreadLife t1 = new ThreadLife();
        System.out.println("Thread state after creation: " + t1.getState());
        t1.start();
        System.out.println("Thread state after start(): " + t1.getState());
        try {
            Thread.sleep(500);
            System.out.println("Thread state while running: " + t1.getState());
            t1.join();
            System.out.println("Thread state after completion: " + t1.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}