package book.chapter7;

public class Outer {
    int outer_x =100;

    void test(){
        for (int i = 0; i < 10; i++) {
            Inner inner = new Inner();
            inner.display();
        }

    }
    class Inner{
        void display(){
            System.out.println(("вывoд: outer_x = "+ outer_x));
        }
    }
}
