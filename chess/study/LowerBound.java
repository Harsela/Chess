package chess.study;

import java.util.ArrayList;
import java.util.List;
public class LowerBound{
public static void add(List<? super Integer> list) {
    list.add(100);
    System.out.println("Value: "+list);
}
public static void main(String[]args){
    List <Integer> list1 = new ArrayList<>();
    add(list1);
    List <Number> list2 = new ArrayList<>();
    add(list2);
    //List <Double> list3 = new ArrayList<>();
    //add(list3);
}
}