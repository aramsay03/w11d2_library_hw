import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;

    public Library() {
        this.stock = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.stock.size();
    }

    public void addBookToStock(Book book) {
        this.stock.add(book);
    }
}
