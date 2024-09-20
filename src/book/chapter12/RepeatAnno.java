package book.chapter12;

import java.lang.reflect.*;
import java.lang.annotation.*;
public class RepeatAnno {
    @MyAnno(str = "Первая аннотация",val =-1)
    @MyAnno(str = "Второя аннотация",val = 100)

    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            Method m =c.getMethod("myMeth", String.class, int.class);

            Annotation anno =m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException  exc){
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("тест",10);
    }
}
