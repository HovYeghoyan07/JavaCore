package book.chapter7;

public class RetOb {
    public static void main(String[] args) {
        Test2 ob1 = new Test2(2);
        Test2 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " +ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("о22.а после второго увеличения значения: "+ob2.a);
    }
}
