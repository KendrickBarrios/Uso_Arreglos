import library.books.Book;
import library.books.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        Book book1 = new Book("A Game of Thrones", "R. R. Martin", 1010, false);
        Book book2 = new Book("The Lord of The Rings", "Tolkien", 1020, false);
        Book book3 = new Book("A Hundred Years of Solitude", "Gabriel Garcia Marquez", 1030, false);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);

        System.out.println("Available books");
        for (Book book : lib.getBooks()) {
            System.out.println(book);
        }

        System.out.println("\nWrite the isbn code of the book you'd like to lend: ");
        int isbn = Integer.parseInt(sc.nextLine());

        lib.lendBook(isbn);
    }
}
