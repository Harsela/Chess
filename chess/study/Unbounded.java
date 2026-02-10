package chess.study;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Unbounded{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("String");

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(11);

       HashSet<Integer>list4=new HashSet<>();
        //HashSet<Integer>list4 = null;
        list4.add(12);
        list4.add(13);

        printList(list1);
        printList(list2);
        printList(list3);
        //printList(Collections.singletonList(list4));
    }
    public static void printList(List<?> list){
        System.out.println(list);
    }
}
