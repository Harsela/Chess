package chess.study;

@FunctionalInterface
interface Greeting{
    void greet(String name);
    static void info() {
        System.out.println("info");
    }
}
interface Welcome extends Greeting {

//    default void welcome(){
//        greet("welcome");
//    }
    default void welcome(String name) {
       System.out.println("Welcome" +name);
    }
}
public class FuncExample{
    public static void main(String[] args){
        Greeting g = name-> System.out.println("Hi "+name);
        g.greet("Stark");
        Welcome w = name-> System.out.println("Hi "+name);
        w.greet("Ned");
        w.welcome(" Ned");
        Greeting.info();
    }
}











