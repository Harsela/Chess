package chess.study.harsela;

import java.lang.reflect.Field;

public class JsonPrep {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        Class<?> obj = s.getClass();
        Field[] fields = obj.getDeclaredFields();
        String json = "{";
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);

            String name = fields[i].getName();
            Object value = fields[i].get(s);
            json += "\"" + name + "\"";
            json += ":";
            json += "\"" + value + "\"";

            if (i < fields.length - 1) {
                json += ",";
            }
        }
        json += "}";

        System.out.println(json);
    }
}


