package homework.homework6;

public class DinamicArrayDemo {
    public static void main(String[] args) {
     DynamicArray da = new DynamicArray();
        for (int i = 0; i < 100; i++) {
            da.add(i);
        }

        System.out.print( da.getByIndex(112));
da.deleteByIndex(9);
    }
}
