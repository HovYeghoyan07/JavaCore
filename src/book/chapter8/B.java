package book.chapter8;

public class B extends A {
    int k;
    int total;
    void show(){
        super.show();
        System.out.println("k: "+ k);
    }
    void sum(){
        System.out.println("i+j+k: "+ (i+k));
    }

}
