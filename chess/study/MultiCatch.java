package chess.study;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[6] = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        } catch (ArithmeticException e) {
            System.out.println("A-Cannot divide by 0");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Index out of bound");
//        }
            try {
                int b[] = new int[3];
                b[2] = 10 / 0;
            } catch (Exception el) {
                System.out.println("B-Cannot divide by 0");
            }
        }
    }
}
