package chess.study.harsela;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MainConstruct {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MainConstruct mc = new MainConstruct();
        Class<?> obj = Construct.class;

        Constructor<?> c = obj.getDeclaredConstructor(String.class, int.class);
        c.setAccessible(true);
        // Object newObj = (Construct) c.newInstance("Value",5);
        Construct newObj = (Construct) c.newInstance("Value", 5);
        System.out.println(newObj);
    }
}
