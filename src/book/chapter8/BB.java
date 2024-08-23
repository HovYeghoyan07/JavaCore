package book.chapter8;

public class BB extends AA{
    int i;
    BB(int a, int b){
        super.i = a;
        i =b;
    }
    void show(){
        System.out.println("Члeн i в суперклассе: "+ super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}
