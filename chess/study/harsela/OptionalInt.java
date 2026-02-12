package chess.study.harsela;

import java.util.Optional;

public class OptionalInt {
    public static void main(String[] args) {
        Optional<Integer> nonnull = Optional.of(1);
        Optional<Integer> nullvalue = Optional.of(0);

        System.out.println("Value: " + nonnull.isPresent());
        System.out.println("Value: " + nonnull.get());



    }
}