package book.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10,10,10);
        Box mybox2 = new Box(10,10,10);

        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм равен" + vol);

        vol  = mybox2.volume();
        System.out.println("Oбъeм равен" + vol);
    }
}
