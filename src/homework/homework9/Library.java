package homework.homework9;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        BookStorage bookStrorage = new BookStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0  for EXIT");
            System.out.println("Please input 1  for ADD_BOOK");
            System.out.println("Please input 2  for PRINT_ALL_BOOKS");
            System.out.println("Please input 3  for SEARCH_BOOK_BY_BOOK_NAME");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input book id");
                    String id = scanner.nextLine();
                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input author's name");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input book price");
                    double  price = Double.parseDouble(scanner.nextLine());
                    Book book = new Book(id,title,authorName,price);
                    bookStrorage.add(book);
                    System.out.println("Book added!");
                    break;
                case "2":
                    bookStrorage.print();
                    break;
                case "3":
                    System.out.println("Please input book keyword");
                    String keyword = scanner.nextLine();
                    bookStrorage.searchByBookName(keyword);
                default:
                    System.out.println("Wrong command");
            }

        }
    }
}
