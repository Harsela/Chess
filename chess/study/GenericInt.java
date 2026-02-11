package chess.study;
public interface GenericInt<T>{
    void display(T value);
}
class GenericClass <T> implements GenericInt <T>{
    @Override
    public void display(T value){
        System.out.println(value);
    }
}
class Main{
    public static void main(String[]args){
        GenericInt<Integer>a=new GenericClass<>();
        a.display(10);
        GenericInt<String>b=new GenericClass<>();
        b.display("ten");
    }
}