package book.chapter7;

public class OverloadDemo {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

//    void test(int a) {
//        System.out.println("a: " + a);
//    }

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове " + "test(double) a: " + a);

    }
}
