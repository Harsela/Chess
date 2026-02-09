package chess.study;
class Bound <T extends Number> {
    T value;
public Bound(T value){
    this.value=value;
}
public void display(){
    System.out.println("Value: "+value);
}
public static void main(String[]args){
    Bound <Integer> b1 = new Bound<>(1);
    b1.display();
    Bound <Double> b2 = new Bound<Double>(99.9);
    b2.display();
}
}
