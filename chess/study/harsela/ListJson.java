package chess.study.harsela;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ListJson {
    public static void main(String[] args) throws IllegalAccessException {
        List<Intern> students = new ArrayList<>();
        students.add(new Intern("Alice",21));
        students.add(new Intern("Walter",23));
        students.add(new Intern("Steeve",24));
        String res = InternList(students);
        System.out.println(res);
    }
    public static String InternList(List<?> list) throws IllegalAccessException {
        String json = "[";
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (i > 0)
                json += ",";

            json += "{";
            Field[] fields = obj.getClass().getDeclaredFields();
            for (int j = 0; j < fields.length; j++) {
                Field f = fields[j];
                f.setAccessible(true);
                json += "\"" + f.getName() + "\":";
                Object value = f.get(obj);
                if (value == null) {
                    json += null;
                } else if (value instanceof Number) {
                    json += value;
                } else {
                    json += "\"" + value + "\"";
                }
                if (j < fields.length - 1)
                    json += ",";
            }
                json += "}";
            }
            json += "]";
            return json;
        }
    }