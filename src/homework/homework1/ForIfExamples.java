package homework.homework1;

public class ForIfExamples {
    public static void main(String[] args) {

        System.out.print("1.");
        for (int x = 1; x < 10; x++) {
            System.out.print(x);
        }
        System.out.println();
        int sum = 0;
        for (int a = 1; a <= 100; a++) {
            sum += a;
        }
        System.out.println("2." + sum);

        System.out.print("3.");
        for (int x = 50; x > 1; x--) {
            System.out.print(x);
        }
        System.out.println();

        System.out.print("4.");
        for (int x = 1; x < 20; x = x + 2) {
            System.out.print(x);

        }
        System.out.println();
        int y = 0;
        for (int x = 0; x < 100; x = x + 2) {
            y = y + 1;
        }
        System.out.println("5." + y);
    }
}
