package org.thebest.lessons.java.best_of_the_year.classes;

public class Movie extends AbstractContenuto {
    String[] cast;

    public Movie(int id, String title, int year, String[] cast) {
        super(id, title, year);

        this.cast = cast;
    }
}
