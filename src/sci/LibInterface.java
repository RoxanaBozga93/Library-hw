package sci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public interface LibInterface {

    public List<? extends Book> getListOfBooks();

    public void setListOfBooks(List<Book> listOfBooks);

    public void addBook(Book carte);

    public void removeAllBooksWithName(String numeCarte);

    public void removeAllBooksWithPages(int nrPag);

    public void print();


    //adauga carti citite de la tastatura
    public void addBooksFromKeyboard();


    public void readBooksFromFile();

}
