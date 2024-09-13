package homework.homework9;

import homework.homework9.model.Author;
import homework.homework9.model.Book;
import homework.homework9.storage.AuthorStorage;
import homework.homework9.storage.BookStorage;
import homework.homework9.storage.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Library implements LibraryCommands {
    private static BookStorage bookStrorage = new BookStorage();
    private static Scanner scanner = new Scanner(System.in);
    private static AuthorStorage authorStorage = new AuthorStorage();




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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStrorage.print();
                    break;
                case PRINT_ALL_AUTHORS:
                    authorStorage.print();
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
                case SEARCH_BOOK_BY_AUTHOR:
                    searchBookByAuthor();
                    break;
                default:
                    System.out.println("Wrong command");
            }

        }
    }

    private static void searchBookByAuthor() {
        authorStorage.print();
        System.out.println("Please choose author ID");
        String authorId = scanner.nextLine();
        Author author = authorStorage.getAuthorById(authorId);
        if (author != null) {
            bookStrorage.searchByAuthor(author);
        }
    }
    private static void addAuthor() {
        System.out.println("Please input id, name, surname, phone, dateOfBirthday(01-10-2000");
        String authorDataStr = scanner.nextLine();
        String[] authorDataArr = authorDataStr.split(",");
        if (authorDataArr.length == 5) {
            String id = authorDataArr[0];
            if (authorStorage.getAuthorById(id) == null) {
                try {
                Author author = new Author();
                author.setId(id);
                author.setName(authorDataArr[1]);
                author.setSurname(authorDataArr[2]);
                author.setPhone(authorDataArr[3]);
                author.setDateOfBirthday(DateUtil.fromStringToDate(authorDataArr[4]));
                authorStorage.add(author);
                System.out.println("Author added!!!");
                } catch (ParseException e) {
                    System.out.println("Date of Birthday is incorrect");;
                }
            }else {
                System.out.println("Author with id "+id+" already exists");
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

        System.out.println("Please input max price");
        try {
            double minPrice = Integer.parseInt(scanner.nextLine());
            double maxPrice = Integer.parseInt(scanner.nextLine());
            bookStrorage.printBooksByPrice(minPrice, maxPrice);
        }catch (NumberFormatException e){
            System.out.println("Please input only digits");
        }
    }

    private static void updateBook() {
        bookStrorage.print();
        System.out.println("Please input book ID");
        String bookId = scanner.nextLine();
        Book bookById = bookStrorage.getBookById(bookId);
        if (bookById != null) {
            authorStorage.print();
            System.out.println("Please choose author ID");
            String authorId = scanner.nextLine();
            Author author = authorStorage.getAuthorById(authorId);
            if (author != null) {
                System.out.println("Please input book's new title");
                String title = scanner.nextLine();
                System.out.println("Please input book's new price");
                String priceStr = scanner.nextLine();
                if (title != null && !title.isEmpty()) {
                    bookById.setTitle(title);
                }

                    bookById.setAuthor(author);

                if (priceStr != null && !priceStr.isEmpty()) {
                    bookById.setPrice(Double.parseDouble(priceStr));
                }

                System.out.println("Update was succesfully");

            }
        }
    }

    private static void searchBookByName() {
        System.out.println("Please input book keyword");
        String keyword = scanner.nextLine();
        bookStrorage.searchByBookName(keyword);
    }

    private static void addBook() {
        authorStorage.print();
        System.out.println("Please choose author ID");
        String authorId = scanner.nextLine();
        Author author = authorStorage.getAuthorById(authorId);
        if (author != null){
            System.out.println("Please input book id");
            String id = scanner.nextLine();
            System.out.println("Please input book title");
            String title = scanner.nextLine();

            System.out.println("Please input book price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input book count");
            int count = Integer.parseInt(scanner.nextLine());

            Book bookById = bookStrorage.getBookById(id);
            if (bookById == null) {
                bookStrorage.add(new Book(id, title, author, price, count, new Date()));
                System.out.println("Book added!");
            } else {
                System.out.println("Book with " + id + " already exists!");
            }
        }else {
            System.out.println("wrong author id");
        }



    }


}
