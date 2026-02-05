package chess.study;

interface Demo {
    int x = 10;
    static void info(){
        System.out.println("Interface static method: x = "+x);
    }
}
class Parent1 implements Demo {
    static int s=100;
    int i=5;
    static{
        s++;
        System.out.println("Static block: s = " + s);
    }
    Parent1() {
        i++;
        System.out.println("Constructor: i = " + i);
    }
    void show(){
        i++;
        System.out.println("Method show: i = " + i);
    }
    public static void main(String[] args) {
        Demo.info();
        Child obj1 = new Child();
        System.out.println("Main start: i = " + obj1.i);
        obj1.show();
    }
}