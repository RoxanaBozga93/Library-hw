package sci;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest extends Library {

    Book carte = new Book();
    int sz = getListOfBooks().size();

    @Test
    public void addBook() {

        addBook(carte);
        assertEquals(sz+1, getListOfBooks().size());
    }

    @Test
    public void removeAllBooksWithName() {
        removeAllBooksWithName(carte.getNume());
        assertFalse(getListOfBooks().size()==sz);
    }

    @Test
    public void addBooksFromKeyboard() {
        addBooksFromKeyboard();
        assertEquals(sz+1, getListOfBooks().size());
    }
}