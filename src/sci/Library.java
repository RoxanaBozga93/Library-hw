package sci;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> listOfBooks;

    public Library(){
        listOfBooks = new ArrayList<>();
    }

    public List<Book> getListOfBooks() {
        return this.listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void addBook(Book carte){
        listOfBooks.add(carte);
    }

    public void removeAllBooksWithName(String numeCarte){
        Iterator<Book> it = listOfBooks.iterator();
        Book book;
        while(it.hasNext()){
            book = it.next();
            if(book.getNume().equals(numeCarte)){
                it.remove();
            }
        }
    }

    public void removeAllBooksWithPages(int nrPag){
        Iterator<Book> it = listOfBooks.iterator();
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
            e.printStackTrace();
        }
    }

}