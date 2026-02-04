package chess;
public class Player {
    String name;
    int id;
    static int counter=1;
    public Player(String name) {
        this.name = name;
        this.id=counter;
        counter++;
    }
    public void showPlayer() {
        System.out.println("Name: " + name + "Id: " + id);
    }
    }