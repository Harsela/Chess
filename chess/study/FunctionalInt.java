package chess.study;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInt {
    public static void main(String[] args) {
        Predicate<String> wordcheck = str -> str.contains("Java");
        String str1 = "Java Programming";
        boolean result = wordcheck.test(str1);
        System.out.println(str1 + " contains Java - " + result);

        Consumer<Integer>print = msg-> System.out.println(5);
        print.accept(5);

        Supplier<String>quote= () -> "Ended";
        System.out.println(quote.equals("Ended"));

//        Supplier<String>quote=() -> "Ended";
//        String res = quote.get();
//        System.out.println(res.equals("Ended"));
    }
}





















