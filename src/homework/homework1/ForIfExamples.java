package homework.homework1;

public class ForIfExamples {
    void first() {
        for (int x = 1; x < 10; x++) {
            System.out.print(x);
        }
        System.out.println();
    }

    void second() {
        int sum = 0;
        for (int a = 1; a <= 100; a++) {
            sum += a;
        }
        System.out.println("2." + sum);
    }

    void third() {
        for (int x = 50; x > 1; x--) {
            System.out.print(x);
        }
        System.out.println();
    }

    void fourtd() {
        for (int x = 1; x < 20; x = x + 2) {
            System.out.print(x);

        }
        System.out.println();
    }

    void fivetd() {
        int y = 0;
        for (int x = 0; x < 100; x = x + 2) {
            y = y + 1;
        }
        System.out.println("5." + y);
    }
}