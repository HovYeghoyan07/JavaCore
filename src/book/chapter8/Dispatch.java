package book.chapter8;

public class Dispatch {
    public static void main(String[] args) {
        AAA a = new AAA();
        BBB b = new BBB();
        CCC c = new CCC();

        AAA r;

        r = a;
        r.callme();

        r =b;
        r.callme();

        r = c;
        r.callme();
    }
}
