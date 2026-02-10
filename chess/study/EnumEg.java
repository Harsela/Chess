package chess.study;
public class EnumEg {
    enum Direction {
        NORTH, EAST, WEST, SOUTH
    }
    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        System.out.println(d);
    }
}