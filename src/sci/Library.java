package sci;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library implements LibInterface{

    private static final Logger log = Logger.getLogger(Library.class);

    //private List<? extends Book> listOfBooks;
    //nu am reusit sa implementez metoda addBook cu generice, asa ca am renuntat la generice
    private List<Book> listOfBooks;


    public Library(){
        listOfBooks = new ArrayList<>();
    }

    public List<? extends Book> getListOfBooks() {
        return this.listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook(Book carte){
        log.info("adding book");
        listOfBooks.add(carte);
    }

    public void removeAllBooksWithName(String numeCarte){
        Iterator<? extends Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()){
            book = it.next();
            if(book.getNume().equals(numeCarte)){
                it.remove();
            }
        }
    }

    public void removeAllBooksWithPages(int nrPag){
        Iterator<? extends Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()){
            book = it.next();
            if(book.getNrPagini()==nrPag){
                it.remove();
            }
        }
    }

    public void print()
    {
        for (Book book : listOfBooks) {
            System.out.println(book.toString());
        }
    }

    //adauga carti citite de la tastatura
    public void addBooksFromKeyboard()
    {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number of read books: ");
        int i = number.nextInt();
        for (int j=0; j<i; j++)
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("enter the number of pages and the name for a book: ");
            int myint = keyboard.nextInt();
            String myString = keyboard.nextLine();

            System.out.println("Am citit:" + myint);
            System.out.println("Am citit:" + myString);

            Book carte = new Book();
            carte.setNume(myString);
            carte.setNrPagini(myint);
            addBook(carte);
        }
    }

    public void readBooksFromFile()
    {
        File file = new File("books.txt");

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                int myint = sc.nextInt();
                String myString = sc.nextLine();

                System.out.println("Am citit:" + myint);
                System.out.println("Am citit:" + myString);
                Book carte = new Book();
                carte.setNume(myString);
                carte.setNrPagini(myint);
                addBook(carte);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            log.error(e.getStackTrace());
           // e.printStackTrace();
        }
    }

}