package book.chapter5;

public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Пpoxoд" + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j==10) break;
                System.out.println(j + " ");
            }
            System.out.println();

        }
        System.out.println("Циклы завершены.");
    }
}
