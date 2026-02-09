package chess.study;
public class Multiple<K,V> {
    public K key;
    public V value;
public Multiple(K key,V value){
    this.key=key;
    this.value=value;
}
public static void main(String[]args){
    Multiple <String,Integer> m1 = new Multiple<>("Sunday",1);
    System.out.println("m1->"+m1.key+" "+m1.value);
    Multiple <Integer,String> m2= new Multiple<>(2,"Monday");
    System.out.println("m2->"+m2.key+" "+m2.value);
}
}
