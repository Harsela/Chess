package chess.study.harsela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
    public String name;
    public int year;

    public Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getN() {
        return name;
    }

    public int getY() {
        return year;
    }
}

class YearCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2) {
        return Double.compare(m1.getY(), m2.getY());
    }
}

public class ComparatorEg {
    public static void main(String[] args) {

        ArrayList<Movie> m = new ArrayList<>();
        m.add(new Movie("Cobweb", 2015));
        m.add(new Movie("Inception", 1977));
        m.add(new Movie("Raw", 1980));

        Collections.sort(m, new YearCompare());
        System.out.println("\nMovies sorted by Year:");
        for (Movie m1 : m) {
            System.out.println(m1.getN() + " " + " " + m1.getY());
        }
    }
}