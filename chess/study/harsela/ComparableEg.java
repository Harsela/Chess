package chess.study.harsela;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEg {
    static class Movie{
        public String name;
        public int year;

        public Movie(String name,int year){
            this.name=name;
            this.year=year;
        }
        public int CompareTo (Movie m){
            return this.year-m.year;
        }
        public class ComparatorEg{
            public static void main(String[]args){

                ArrayList<Movie> l= new ArrayList<>();
                l.add(new Movie("Cobweb", 2015));
                l.add(new Movie("Inception", 1977));
                l.add(new Movie("Raw", 1980));

            }
        }
    }
}
