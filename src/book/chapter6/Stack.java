package book.chapter6;

public class Stack {
    int[] stck = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == stck.length-1) {
            System.out.println("Cтeк заполнен.");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        }
        else{
            return stck[tos--];
        }
    }
}



