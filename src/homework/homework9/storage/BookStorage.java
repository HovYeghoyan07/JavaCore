package homework.homework9.storage;

import homework.homework9.model.Author;
import homework.homework9.model.Book;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size = -1;

    public void add(Book book) {
        if (size == books.length) {
            extendStorage();
        }
        books[++size] = book;
    }

    private void extendStorage() {
        Book[] tmp = new Book[size + 10];
        System.arraycopy(books, 0, tmp, 0, size);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByBookName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public Book getBookById(String id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId().equals(id)) {
                return books[i];
            }
        }
        return null;
    }

    public void printBooksByPrice(double minPrice, double maxPrice) {

        for (int i = 0; i <= size; i++) {
            if (books[i].getPrice() >= minPrice && books[i].getPrice() <= maxPrice) {
                System.out.println(books[i]);
            }
        }
    }

    public void deleteBookById(String Id) {
        if (size > -1) {
            for (int i = 0; i < size; i++) {
                if (books[i].getId().equals(Id)) {
                    for (int j = i; j < size - 1; j++) {
                        books[j] = books[j + 1];
                    }
                    size--;
                }
            }
        }
    }

    public void searchByAuthor(Author author) {
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equals(author)){
                System.out.println(books[i]);
            }
        }
    }
}
