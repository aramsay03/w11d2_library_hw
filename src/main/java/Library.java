import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> stock;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.stock = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.stock.size();
    }

    public void addBookToStock(Book book) {
        this.stock.add(book);
    }
}
