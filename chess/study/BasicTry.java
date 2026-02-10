package chess.study;
public class BasicTry {
public void main (String[] args){
    try{
        int a = 10;
        int b= 0;
        int result = a/b;
        int arr[]= new int[3];
        System.out.println(arr[4]);
    }catch (ArithmeticException e){
        System.out.println("Cannot divide by zero");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index Out of Bound Exception");
    }catch(Exception e){
        System.out.println("General Exception");
    }
    finally{
        System.out.println("Program ended");
    }
}
}
