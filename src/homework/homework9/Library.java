package homework.homework9;

import book.chapter8.A;

import java.util.Scanner;

public class Library implements LibraryCommands {
    private static BookStorage bookStrorage = new BookStorage();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            LibraryCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStrorage.print();
                    break;
                case SEARCH_BOOK_BY_NAME:
                    searchBookByName();
                    break;
                case UPDATE_BOOK:
                    updateBook();
                    break;
                case SEARCH_BY_PRICE:
                    searchBookByPrice();
                    break;
                case DELETE_BY_ID:
                    deleteById();
                    break;
                default:
                    System.out.println("Wrong command");
            }

        }
    }

    private static void deleteById() {
        System.out.println("Please input book id");
        String id = scanner.nextLine();
        bookStrorage.deleteBookById(id);
    }


    private static void searchBookByPrice() {
        System.out.println("Please input min price");
        int minPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max price");
        int maxPrice = Integer.parseInt(scanner.nextLine());
        bookStrorage.printBooksByPrice(minPrice, maxPrice);
    }

    private static void updateBook() {
        bookStrorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStrorage.getBookById(bookId);
        if (bookById != null) {
            System.out.println("Please input book's new title");
            String title = scanner.nextLine();
            System.out.println("Please input author's new name");
            String authorName = scanner.nextLine();
            System.out.println("Please input book's new price");
            String priceStr = scanner.nextLine();
            if (title != null && !title.isEmpty()) {
                bookById.setTitle(title);
            }
            if (authorName != null && !authorName.isEmpty()) {
                bookById.setAuthorName(authorName);
            }
            if (priceStr != null && !priceStr.isEmpty()) {
                bookById.setPrice(Double.parseDouble(priceStr));
            }

            System.out.println("Update was succesfully");

        }
    }

    private static void searchBookByName() {
        System.out.println("Please input book keyword");
        String keyword = scanner.nextLine();
        bookStrorage.searchByBookName(keyword);
    }

    private static void addBook() {
        System.out.println("Please input book id");
        String id = scanner.nextLine();
        System.out.println("Please input book title");
        String title = scanner.nextLine();
        System.out.println("Please input author's name");
        String authorName = scanner.nextLine();
        System.out.println("Please input book price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book count");
        int count = Integer.parseInt(scanner.nextLine());

        Book bookById = bookStrorage.getBookById(id);
        if (bookById == null) {
            bookStrorage.add(new Book(id, title, authorName, price, count));
            System.out.println("Book added!");
        } else {
            System.out.println("Book with " + id + " already exists!");
        }


    }


}
