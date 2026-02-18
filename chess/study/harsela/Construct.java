package chess.study.harsela;

public class Construct {
    String s;
    int v;

    private Construct(String s, int v) {
        this.s = s;
        this.v = v;
    }

    @Override
    public String toString() {
        return "Construct{s= " + s + ",v= " + v + "}";
    }
}
