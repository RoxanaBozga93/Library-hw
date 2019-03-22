/**
 * SetLibrary creeaza un set cu obiecte de tip Book (Novel, ArtAlbum, Science)
 *
 * @author Roxana Bozga
 */
package sci;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetLibrary {

    private static final Logger log = Logger.getLogger(Library.class);

    private Set<Book> setOfBooks;

    public SetLibrary() {
        setOfBooks = new TreeSet<Book>();
    }

    public Set<Book> getSetOfBooks() {
        return this.setOfBooks;
    }

    public void setSetOfBooks(Set<Book> setOfBooks) {
        this.setOfBooks = setOfBooks;
    }

    public void setAddBook(Book carte){
        log.info("adding book");
        setOfBooks.add(carte);
    }

    public void setRemoveBooksWithName(String numeCarte){
        Iterator<Book> it = setOfBooks.iterator();
        Book book;
        while(it.hasNext()){
            book = it.next();
            if(book.getNume().equals(numeCarte)){
                it.remove();
            }
        }
    }

    public void print()
    {
        for (Book book : setOfBooks) {
            System.out.println(book.toString());
        }
    }

    public void searchBook(String numeCarte) {
        for (Book book : setOfBooks) {
            if (book.getNume() == numeCarte) {
                System.out.println(book.toString());
            }
        }
    }
}
