package homework.homework8;

import java.util.Scanner;

public class BraceCheckerDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        BraceChecker braceChecker = new BraceChecker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text with brackets to check: ");
        String input = scanner.nextLine();
        braceChecker.setText(input);
braceChecker.check();
    }

}
