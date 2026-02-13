package chess.study.harsela;
public class InteruptEg extends Thread {

    public void run() {
        System.out.println(Thread.interrupted());  //clears flag  t t
        System.out.println(Thread.interrupted());  //f             f
    }
    public static void main(String[] args) {
        InteruptEg t = new InteruptEg();
        t.start();
        t.interrupt();                              //tt
       //System.out.println(Thread.currentThread().isInterrupted());  //mf
        System.out.println(t.isInterrupted());  //flag not cleared tt
    }
}


