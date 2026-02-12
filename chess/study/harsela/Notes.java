package chess.study.harsela;

public class Notes extends ImmutableBook {
    private int price;

    public Notes(String title, int pages, int price) {
        super(title, pages);
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Notes n = new Notes("Java Notes", 150, 300);

        System.out.println("Title: " + n.getTitle());
        System.out.println("Pages: " + n.getPages());
        System.out.println("Price: " + n.getPrice());

        n.setPrice(400);
        System.out.println("Updated Price: " + n.getPrice());
    }
}
