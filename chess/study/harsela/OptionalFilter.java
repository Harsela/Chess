package chess.study.harsela;

import java.util.Optional;

public class OptionalFilter {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Alice");

        Optional<String> result1 = name.filter(n -> n.startsWith("A"));
        System.out.println(result1.orElse("Name does not start with A"));

        Optional<String> result2 = name.filter(n -> n.startsWith("B"));
        System.out.println(result2.orElse("Name does not start with B"));

    }
}
