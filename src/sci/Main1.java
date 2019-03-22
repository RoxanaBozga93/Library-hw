package sci;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){

        //instantiem clasele prin crearea de obiecte de tip Book, Novel si ArtAlbum
        Book carte1 = new Book();
        carte1.setNume("carte1");
        carte1.setNrPagini(10);

        Book carte2 = new Book();
        carte2.setNume("carte2");
        carte2.setNrPagini(100);

        Novel nuv1 = new Novel();
        nuv1.setNume("nuv1");
        nuv1.setNrPagini(100);
        nuv1.setType("nuvela");

        Novel nuv2 = new Novel();
        nuv2.setNume("nuv2");
        nuv2.setNrPagini(500);
        nuv2.setType("nuvela");

        ArtAlbum art1 = new ArtAlbum();
        art1.setNume("art1");
        art1.setNrPagini(20);
        art1.setCaliateHartie("cool");

        ArtAlbum art2 = new ArtAlbum();
        art2.setNume("art2");
        art2.setNrPagini(40);
        art2.setCaliateHartie("awsome");

        Book nuvela = new Novel();
        nuvela.setNume("nuv1");
        nuvela.setNrPagini(100);
        ((Novel) nuvela).setType("action");


        Book albumArta = new ArtAlbum();
        albumArta.setNume("art2");
        albumArta.setNrPagini(40);
        ((ArtAlbum) albumArta).setCaliateHartie("impressive");

        //creem colectia librarie de tip Library cu obiecte de tip Book
        Library librarie = new Library();



        Scanner optiune1 = new Scanner(System.in);
        System.out.println("Cum doriti sa adaugati carti in lista? 1-de la tastatura/2-din fisier/3-din linia de cod ");
        int myint = optiune1.nextInt();

        if (myint==1)
        {
            System.out.println("adaugam cartile de la tastatura: ");
            //citeste carti de la tastatura
            librarie.addBooksFromKeyboard();
        }
        else if (myint==2)
        {
            System.out.println("adaugam cartile din fisier: ");
            //citim carti din fisierul books.txt si afisam ce am citit
            librarie.readBooksFromFile();
        }
        else
        {
            //adaugam carti in colectie
            System.out.println("adaugam cartile din linia de cod: ");
            librarie.addBook(carte1);
            librarie.addBook(carte2);
            librarie.addBook(nuv1);
            librarie.addBook(nuv2);
            librarie.addBook(nuvela);
            librarie.addBook(albumArta);
        }


        System.out.println("Selectati optiunea dorita din meniul urmator: ");
        System.out.println("1-Adaugati carti de la tastatura: ");
        System.out.println("2-Adaugati carti din fisier: ");
        System.out.println("3-Afisati cartile din colectie: ");
        System.out.println("4-Stergeti cartile din colectie cu un anumit nume: ");
        System.out.println("5-Stergeti cartile din colectie cu un anumit nr de pagini: ");
        System.out.println("0-Iesiti din executie. ");
        Scanner optiune2 = new Scanner(System.in);
        int nr = optiune2.nextInt();
        do {

            if (nr==1)
            {
                System.out.println("adaugam carti de la tastatura: ");
                //citeste carti de la tastatura
                librarie.addBooksFromKeyboard();
            }
            else if (nr==2)
            {
                System.out.println("adaugam carti din fisier: ");
                //citim carti din fisierul books.txt si afisam ce am citit
                librarie.readBooksFromFile();
            }
            else if (nr==3)
            {
                System.out.println("Cartile din colectie sunt: ");
                //afisam cartile din colectie dupa stergere
                librarie.print();
            }
            else if (nr==4)
            {
                System.out.println("Stergem cartile cu un anumit nume: ");
                //stergem toate cartile din coletcie cu un anumit nume
                Scanner nume = new Scanner(System.in);
                System.out.println("Introduceti numele cartii care doriti sa fie stearsa din colectie: ");
                String myString = nume.nextLine();
                librarie.removeAllBooksWithName(myString);
            }
            else if (nr==5)
            {
                System.out.println("Stergem cartile cu un anumit nr de pagini: ");
                //stergem toate cartile din coletcie cu un anumit numar de pagini
                Scanner nrPagini = new Scanner(System.in);
                System.out.println("Introduceti numele cartii care doriti sa fie stearsa din colectie: ");
                int myNr = nrPagini.nextInt();
                librarie.removeAllBooksWithPages(myNr);
            }
            System.out.println("Selectati optiunea dorita din meniul urmator: ");
            System.out.println("1-Adaugati carti de la tastatura: ");
            System.out.println("2-Adaugati carti din fisier: ");
            System.out.println("3-Afisati cartile din colectie: ");
            System.out.println("4-Stergeti cartile din colectie cu un anumit nume: ");
            System.out.println("5-Stergeti cartile din colectie cu un anumit nr de pagini: ");
            System.out.println("0-Iesiti din executie. ");
            Scanner optiune3 = new Scanner(System.in);
            nr = optiune3.nextInt();

        } while (nr!=0);







    }
}
