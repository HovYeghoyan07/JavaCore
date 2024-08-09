package book.chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test1 obb = new Test1();
        int a =15, b =20;
        System.out.println("a и b до вызова: "+a+" "+b);
        obb.methh(a,b);
        System.out.println("a и b после вызова: "+a+" "+b);
    }
}
