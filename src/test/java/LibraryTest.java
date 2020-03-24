import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void setup() {
        library = new Library("CodeClan Book Shelf", 10);
        book = new Book("The Clean Coder", "Robert C Martin", "Computer Programming");
    }

//      Check that number of books in stock
    @Test
    public void countNumberOfBooksInStock() {
        assertEquals(0, library.bookCount());
    }

//      Add Book to library stock
    @Test
    public void canBookBeAddedToStock() {
        // ACT
        library.addBookToStock(book);
        // ASSERT
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkThatBookCantBeAddIfAtCapacity() {
        library = new Library("Personal Book Collection", 1);
        library.addBookToStock(book);
        library.addBookToStock(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkIfBookCanBeRemovedFromStock() {
        library.addBookToStock(book);
        library.removeBookFromStock();
        assertEquals(0, library.bookCount());
    }

}
