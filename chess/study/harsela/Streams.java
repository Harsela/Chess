package chess.study.harsela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Walter", "Heisenberg", "Stark", "JohnSnow");

        List<String> res = names.stream()
                .filter(n -> n.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(res);
    }
}
