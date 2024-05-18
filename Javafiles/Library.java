/*
 *  A library is a collection of books. Generally, a book is authored by one or more authors.
Develop a program to add books and display a list of books when searched by author
name. Consider title, ISBN number, publisher name, publication year for book;
designation, organization, and country for author.
 */
import java.util.Scanner;

class Book {
    String title;
    int isbn;
    String pubName;
    int pubYear;
    Author[] authors;

    Book(String title, int isbn, String pubName, int pubYear, Author[] authors) {
        this.title = title;
        this.isbn = isbn;
        this.pubName = pubName;
        this.pubYear = pubYear;
        this.authors = authors;
    }

    boolean hasAuthor(String name) {
        for (Author author : authors) {
            if (author.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    String show() {
        String by = new String();
        for (int i=0;i<authors.length;i++) {
            by += authors[i].name + " ";
        }
        String ans= isbn+" "+title+" - "+by+" "+pubYear;
        return ans;
        // return String.format("%d: %s - %s(%d)", isbn, title, by, pubYear);
    }
}

class Author {
    String name;
    String designation;
    String organization;
    String country;

    Author(String name, String designation, String organization, String country) {
        this.name = name;
        this.designation = designation;
        this.organization = organization;
        this.country = country;
    }
}

public class Library {
    public static void main(String[] args) {
        Book[] library = new Book[4];
        Author soubhagya = new Author("Soubhagya", "The idiot", "ABC", "Bharat");
        Author chetan = new Author("Chetan Bhagat", "Indian girl", "DEF", "India");
        Author durjoy = new Author("Durjoy dutta", "The", "GHI", "California");

        library[0] = new Book("How to die", 1, "MarkPenguin", 3, new Author[]{soubhagya});
        library[1] = new Book("Lorem ipsum", 2, "Selina", -2, new Author[]{chetan});
        library[2] = new Book("dolor sit amet", 3, "MarketLoss", 10, new Author[]{durjoy, soubhagya});
        library[3] = new Book("consectetur", 4, "Smturi", 2004, new Author[]{chetan});

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter author to search: ");
        String name = sc.nextLine();

        for (Book book : library) {
            if (book.hasAuthor(name)) {
                System.out.println(book.show());
            }
        }
        sc.close();
    }
}
