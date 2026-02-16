package chess.study.harsela;

import java.util.stream.Stream;

public class Builder {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        builder.add("Sunday");
        builder.add("Monday");
        builder.add("Tuesday");
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
}
