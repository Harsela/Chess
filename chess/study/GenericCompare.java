package chess.study;
public class GenericCompare {
    public static <T extends Comparable<T>> T max(T a, T b){
        return (a.compareTo(b)>0)?a:b;
    }
        public static void main(String[]args){
            int ans=max(3,4);
            System.out.println(ans);
        }
    }
