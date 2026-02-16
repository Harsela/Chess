package chess.study.harsela;

import java.io.PrintStream;

public class PrintStreamEg {
    public static void main(String[] args) {

        PrintStream ps = System.out;
        ps.println("Hello");
        ps.println(100);

        ps.close();
        ps.println("Wont print");
        if (ps.checkError()) {
            System.out.println("Error occurred!");
        } else {
            System.out.println("Written");
        }
    }
}
