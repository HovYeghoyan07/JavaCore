package book.chapter14;

public class NonGen {


    Object ob;

    NonGen(Object o){
        ob =o;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Tипoм Т является "+ob.getClass().getName());
    }
}
