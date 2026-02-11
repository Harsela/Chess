package chess.study;
public class GenericPair <K,V> {
    K key;
    V value;

    public GenericPair(K key, V value) {
        this.key=key;
        this.value=value;
    }
    public void show(){
    System.out.println(key+","+value);
}
public static void main(String[]args){
    GenericPair<Integer,String>pair=new GenericPair<>(10,"Ten");
    pair.show();
}
}
