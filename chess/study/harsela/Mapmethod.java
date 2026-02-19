package chess.study.harsela;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Mapmethod {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee();
        Class<?> obj = e.getClass();

        Map<String, Object> map = new HashMap<>();
        Method[] methods = obj.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(MyAnnotation.class) && m.getParameterCount() == 0){
                m.setAccessible(true);
                Object value = m.invoke(e);
                map.put(m.getName(), value);
            }
        }
        String json = "{";
        int i = 0;

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            json += "\"" + entry.getKey() + "\":";
            Object value = entry.getValue();
            if (value instanceof Number) {
                json += value;
            }else{
                json += "\"" + value + "\"";
            }
            if(i < map.size() - 1) {
                json += ",";
            }
            i++;
        }
        json+="}";
        System.out.println(json);
    }
}
