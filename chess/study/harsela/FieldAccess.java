package chess.study.harsela;

import java.lang.reflect.Field;

public class FieldAccess {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s1 = new Student();
        Class<?> obj = s1.getClass();
        String name = obj.getName();
        System.out.println("Name: " + name);

//        Field f = obj.getDeclaredField("name");
//        f.setAccessible(true);
//        String fieldValue = (String) f.get(s1);
//        System.out.println("FieldValue: "+fieldValue);

        Field[] f = obj.getDeclaredFields();
        for (Field fields : f) {
            fields.setAccessible(true);
            Object val = fields.get(s1);
            System.out.println("Fields: " + val);
        }
    }
}