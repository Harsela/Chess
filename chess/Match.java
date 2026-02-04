package chess;
class Match {
    Player p1;
    Player p2;

    Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
   public Player selectWinner(int choice) {
        if (choice == 1) {
            System.out.println(p1.name + " wins");
            return p1;
        } else {
            System.out.println(p2.name + " wins");
            return p2;
        }
    }
}
