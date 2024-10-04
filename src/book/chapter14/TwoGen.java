package book.chapter14;

public class TwoGen <T, V>{
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 =o1;
        ob2=o2;
    }

    T getOb1(){
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    void showTypes(){
        System.out.println("Tипoм Т "+ob1.getClass().getName());
        System.out.println("Tипoм V "+ob2.getClass().getName());
    }
}
