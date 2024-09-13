package library.books;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int isbn) {
        return books.get(isbn);
    }

    public void lendBook(int isbn) {
        for (Book book : books) {
            if (book.getIsbn() == isbn) {
                if (book.isLent()) {
                    System.out.println("You can't lend the book since it's already lent");
                } else {
                    book.setLent(true);
                    System.out.println("You successfully lent the book");
                    return;
                }
            }
            System.out.println("You can't lend the book since it doesn't exist");
            return;
        }
    }
}
