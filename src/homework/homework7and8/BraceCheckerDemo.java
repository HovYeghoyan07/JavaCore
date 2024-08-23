package homework.homework7and8;

import java.util.Scanner;

public class BraceCheckerDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static BraceChecker bc = new BraceChecker();
    public static void main(String[] args) {
        takeText();



    }
    private static void takeText(){
        System.out.println("Input text");
        String text = scanner.nextLine();
        bc.setText(text);
        bc.check();
    }
}
