package book.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Константы перечислимого типа Apple:");

        Apple[] allApples=Apple.values();
        for (Apple a : allApples)
            System.out.println(a);

        System.out.println();

        ap = Apple.valueOf("WINESAP");
        System.out.println("Пepeмeннaя ар содержит "+ap);
    }
}
