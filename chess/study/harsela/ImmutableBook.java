package chess.study.harsela;

public class ImmutableBook {
    private final String title;
    private final int pages;

    public ImmutableBook(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}
