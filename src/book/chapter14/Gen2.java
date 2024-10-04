package book.chapter14;

public class Gen2<T>extends Gen<T> {
    Gen2(T o){
        super(o);
    }

    T getob(){
        System.out.print("Meтoд getob() из класса Gen2: ");
        return ob;
    }
}
