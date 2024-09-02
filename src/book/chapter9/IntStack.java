package book.chapter9;

public interface IntStack {
    void push(int item);
    int pop();
    default void  clear(){
        System.out.println("Meтoд clear() не реализован.");
    }
}
