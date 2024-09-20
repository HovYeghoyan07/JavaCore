package book.chapter12;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno {
    String str();
    int val();
}
