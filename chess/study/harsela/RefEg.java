package chess.study.harsela;

import java.lang.Class;
import java.lang.reflect.*;

class Animal {
}

public class RefEg {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Dog d1 = new Dog();
        Class<?> obj = d1.getClass();
        String name = obj.getName();
        System.out.println("Name: " + name);

        Method Privatedisplay = obj.getDeclaredMethod("display");
        Privatedisplay.setAccessible(true);
        Privatedisplay.invoke(d1);

        Method Privatecolor = obj.getDeclaredMethod("color", String.class);
        Privatecolor.setAccessible(true);
        Privatecolor.invoke(d1, "Black");
    }
}
