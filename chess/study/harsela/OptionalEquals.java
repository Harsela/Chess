package chess.study.harsela;

import java.util.Optional;

public class OptionalEquals {
    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

//        Optional<String> optionalA = Optional.of(a);
//        Optional<String> optionalB = Optional.of(b);
//        boolean isEqual = optionalA.equals(optionalB);

//        Optional<String> optionalA = Optional.of(a);
//        boolean isEqual = optionalA
//                .map(val -> val.equals(b))
//                .orElse(false);

        boolean isEqual = Optional.of(a).equals(Optional.of(b));
        System.out.println(isEqual);
    }
}
