package book.chapter14;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb=new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("Знaчeниe: " +v);
        System.out.println();

        NonGen strOb= new NonGen("Тест обобщений");
        strOb.showType();

        String str =(String) strOb.getOb();
        System.out.println("Знaчeниe: "+str);
    }
}
