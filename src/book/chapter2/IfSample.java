package book.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x,y;
        x = 10;
        y = 20;
        if (x < y){
            System.out.println("x փոքր է y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x արդեն հավասար է y");
        }
        x = x * 2;
        if (x > y){
            System.out.println("x արդեն մեծ է y" );
        }
        if (x == y){
            System.out.println("Nothing");
        }
    }
}
