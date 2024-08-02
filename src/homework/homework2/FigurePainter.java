package homework.homework2;

public class FigurePainter {

    void figureOne() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    void figureTwo() {
        for (int i = 6; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    void figureThree() {
        int a = 0;

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {

                System.out.print("  ");

            }
            for (int j = 0; j < a + 1; j++) {
                System.out.print("* ");

            }
            a++;
            System.out.println();

        }
        System.out.println();
        System.out.println();

    }

    void figureFour() {
        for (int i = 6; i > 0; i--) {
            for (int j = 6 - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void figureFive() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = i - 1; j > 0; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
