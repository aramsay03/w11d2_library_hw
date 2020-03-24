import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp() {
        borrower = new Borrower("Alan");
        book = new Book("The Clean Coder", "Robert C Martin", "Computer Programming");
    }

    // Check number of books in borrowers collection
    @Test
    public void countNumberOfBooksInCollection() {
        assertEquals(0, borrower.booksBowrroed());
    }

    @Test
    public void canBorrowerBorrowABook() {
        library = new Library("CodeClan Book Shelf", 10);
        library.addBookToStock(book);
        borrower.borrowBook(library);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.booksBowrroed());
    }
}
