/**
 * ArrayLibrary creeaza un arrayList cu obiecte de tip Book (Novel, ArtAlbum, Science)
 *
 * @author Roxana Bozga
 */
package sci;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayLibrary{

    private static final Logger log = Logger.getLogger(Library.class);

    private Book[] arrayListOfBooks;

    public ArrayLibrary() {
        arrayListOfBooks = new Book[100];
    }

    public Book[] geArrayListOfBooks() {
        return this.arrayListOfBooks;
    }

    public void setArrayListOfBooks(Book[] arrayListOfBooks) {
        this.arrayListOfBooks = arrayListOfBooks;
    }

    /**
     * This method will add elements to an array and return the resulting array
     * @param arr
     * @param elements
     * @return
     */
    public static Book[] arrayAddBook(Book[] arr, Book... elements){
        log.info("adding book");
        Book[] tempArr = new Book[arr.length+elements.length];
        System.arraycopy(arr, 0, tempArr, 0, arr.length);

        for(int i=0; i < elements.length; i++)
            tempArr[arr.length+i] = elements[i];
        return tempArr;

    }


    public Book[] arrayRemoveBook(Book[] arrayListOfBooks, Book carte)
    {
        for (int i = 0; i < arrayListOfBooks.length; i++)
        {
            if (arrayListOfBooks[i] == carte)
            {
                Book[] copy = new Book[arrayListOfBooks.length-1];
                System.arraycopy(arrayListOfBooks, 0, copy, 0, i);
                System.arraycopy(arrayListOfBooks, i+1, copy, i, arrayListOfBooks.length-i-1);
                return copy;
            }
        }
        return arrayListOfBooks;
    }


    public void print() {
        for (int i = 0; i < arrayListOfBooks.length; i++) {
            System.out.println(arrayListOfBooks[i]);
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
                arrayAddBook(arrayListOfBooks, carte);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
