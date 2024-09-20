package book.chapter12;



import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)

public @interface MyRepeatedAnnos {
    MyAnno[] value();
}
