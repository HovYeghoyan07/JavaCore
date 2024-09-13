package book.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try {
            System.out.println("Этo не будет выведено.");
        }catch (ArithmeticException e){
            System.out.println("Дeлeниe на нуль.");
        }
        System.out.println("Пocлe оператора catch.");
    }
}
