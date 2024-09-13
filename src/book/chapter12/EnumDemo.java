package book.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RED_DEL;

        System.out.println("Знaчeниe ар: " +ap);
        System.out.println();

        ap = Apple.GOLDEN_DEL;

        if (ap ==Apple.GOLDEN_DEL){
            System.out.println("Переменная ар содержит GoldenDel.\n");
        }

        switch (ap){
            case JONATHAN -> System.out.println("Copт Jonathan красный.");
            case GOLDEN_DEL -> System.out.println("Сорт Golden Delicious желтый.");
            case RED_DEL -> System.out.println("Copт Red Delicious красный.");
            case WINESAP -> System.out.println("Copт Winesap красный.");
            case CORTLAND -> System.out.println("Copт Cortland красный.");
        }
    }
}
