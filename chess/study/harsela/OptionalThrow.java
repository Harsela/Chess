package chess.study.harsela;

import java.util.Optional;

public class OptionalThrow {
    public static void main(String[] args) {

        Optional<String> name = Optional.ofNullable("Walter");
        String result = name.orElseThrow(() -> new RuntimeException("Walter Name not found"));
        System.out.println(result);


        Optional<String> emptyName = Optional.ofNullable(null);
        String result2 = emptyName.orElseThrow(() -> new RuntimeException("Name not found"));
        System.out.println(result2);
    }
}
