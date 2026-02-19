package chess.study.harsela;
public class Employee {

    int experience = '2';
    String name = "Walter";
    int salary = 1000;
    @MyAnnotation
    private String name(){
        return name;
    }
    @MyAnnotation
    private int experience(){
        return experience;
    }
    private int salary(){
        return salary;
    }
}
