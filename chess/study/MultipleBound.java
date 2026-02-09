package chess.study;
interface Print{
    void print();
}
interface Show{
    void show();
}
public class MultipleBound{
    void multibound() {
        System.out.println("Multi Bound");
    }
class Base<T extends Print & Show> {
    T obj;

    public Base(T obj) {
        this.obj = obj;
    }
    public void display() {
        this.print();
        this.show();
        obj.print();
        obj.show();
    }
    void print() {
        System.out.println("Print..");
    }
    void show() {
        System.out.println("Show..");
    }
}
public static void main(String[]args) {
    MultipleBound outer = new MultipleBound();
    class Example implements Print, Show {
        @Override
        public void print() {
            System.out.println("Example -> print");
        }
        @Override
        public void show() {
            System.out.println("Example-> show");
        }
    }
        Example eg = new Example();
        Base<Example>base = outer.new Base<>(eg);
        base.display();
    }
}

