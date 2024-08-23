package book.chapter7;

public class VarArgs4 {
    static void vaTest(int ... v){
        System.out.print(("Koличecтвo аргументов: " + v.length +  " Содержимое: "));
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... v){
        System.out.print(("Koличecтвo аргументов: " + v.length +  " Содержимое: "));
        for (boolean i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1,2,3);
        vaTest(true,false,false);
        
    }
}
