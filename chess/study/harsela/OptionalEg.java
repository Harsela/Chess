package chess.study.harsela;

import java.util.Optional;

public class OptionalEg {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Alice");
        System.out.println(name.get());

        Optional<String> emptyName = Optional.ofNullable("null");
        //System.out.println(emptyName.orElse("Default"));
    }
}
