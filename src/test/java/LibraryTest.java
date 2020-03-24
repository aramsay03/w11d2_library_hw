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
//        book = new Book("The Clean Coder", "Robert C Martin", "Computer Programming");
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

}
