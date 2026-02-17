package chess.study.harsela;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnnotation
public class MainAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationClass as = new AnnotationClass();
        Class<?> obj = as.getClass();

        Method m = obj.getDeclaredMethod("hdfc");
        m.setAccessible(true);

        if (m.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = m.getAnnotation(MyAnnotation.class);
            System.out.println("Value :" + annotation.value());
            System.out.println("Count :" + annotation.count());
        }

    }
}
