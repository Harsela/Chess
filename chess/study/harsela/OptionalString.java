package chess.study.harsela;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        Optional<String> a = Optional.of("java"); //String
        String b = "java";

//        String res = String.valueOf(((a
//                .filter(val -> val.equals(b))))); //optional["java"] String
//        System.out.println(res);
//    }
//}
        Optional<String> res = (a
                .filter(val -> val.equals(b))); //optional["java"] String
//             .orElse(String.valueOf(false));
        System.out.println(res);
    }
}