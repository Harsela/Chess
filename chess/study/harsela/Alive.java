package chess.study.harsela;

class Alive extends Thread {

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Thread finished work");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Alive t = new Alive();
        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());
        t.join();
        System.out.println("After completion: " + t.isAlive());
    }
}
