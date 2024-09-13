package homework.homework9.storage;

import homework.homework9.model.Author;
import homework.homework9.model.Book;

public class AuthorStorage {
    private Author[] authors = new Author[10];
    private int size = -1;

    public void add(Author author) {
        if (size == authors.length) {
            extendStorage();
        }
        authors[++size] = author;
    }

    private void extendStorage() {
        Author[] tmp = new Author[size + 10];
        System.arraycopy(authors, 0, tmp, 0, size);
        authors = tmp;
    }

    public void print() {
        for (int i = 0; i <= size; i++) {
            System.out.println(authors[i]);
        }
    }



    public Author getAuthorById(String id) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getId().equals(id)) {
                return authors[i];
            }
        }
        return null;
    }



    public void deleteAuthorById(String Id) {
        if (size > -1) {
            for (int i = 0; i < size; i++) {
                if (authors[i].getId().equals(Id)) {
                    for (int j = i; j < size - 1; j++) {
                        authors[j] = authors[j + 1];
                    }
                    size--;
                }
            }
        }
    }
}
