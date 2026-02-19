package chess.study.harsela;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class MapJson {
    public static void main(String[]args) throws IllegalAccessException {
        Student s = new Student();
        Class<?>obj = s.getClass();
        Field[] fields = obj.getDeclaredFields();
        Map<String,Object> map= new HashMap<>();
        for(Field f:fields) {
            f.setAccessible(true);
            map.put(f.getName(), f.get(s));
        }
        String json = "{";
            int i=0;
            for(Map.Entry<String,Object> entry: map.entrySet()) {
                json += "\"" + entry.getKey() + "\"";
                json += ":";
                Object value = entry.getValue();
                if (value == null) {
                    json += "null";
                }
                else if (value instanceof Number) {
                    json += value;
                }else{
                    json += "\"" + value + "\"";
                }
                if(i < map.size() - 1){
                    json += ",";
                }
                i++;
            }
                json += "}";
        System.out.println(json);
    }
}
