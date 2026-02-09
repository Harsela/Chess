package chess.study;
import java.util.ArrayList;
import java.util.List;
public class Generic{
    List list = new ArrayList();
    public Generic(){
        list.add("Hai");
    }
    public void print() {
        String s = list.get(0).toString();
        System.out.println(s);
    }
    public static void main(String[]args){
        Generic g = new Generic();
        g.print();
    }
public static class Generic1<T>{
        List<T> genList = new ArrayList<>();
        public Generic1(T value) {
            genList.add(value);
        }
        public void printGen(){
            T t = genList.get(0);
            System.out.println(t);
        }
        public static void main(String[]args){
            Generic1<String> g1 = new Generic1<>("Eight");
            g1.printGen();
            Generic1<Integer>g2 = new Generic1<>(8);
            g2.printGen();
        }
}
}

