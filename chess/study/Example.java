package chess.study;

abstract class Parent{
    //static int i = 5;
    int i=5;
//    static{
//        i++;
//        System.out.println("Static block: i="+i);
//    }
    Parent(){
        i++;
        System.out.println("Constructor:i= "+i);
    }
    abstract void show();
}
class Child extends Parent{
    void show(){
        i++;
        System.out.println("Method show:i= "+i);
    }
    public static void main(String[] args){
        Child c = new Child();
        System.out.println("Main start: i = " + c.i);
        //Child c = new Child();
        c.show();
    }
}
