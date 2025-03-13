package org.thebest.lessons.java.best_of_the_year.classes;

public class Movie extends AbstractContenuto {
    String[] cast;

    public Movie(int id, String title, int year, String image, String[] cast) {
        super(id, title, year, image);

        this.cast = cast;
    }

    public String[] getCast() {
        return cast;
    }

    public void setCast(String[] cast) {
        this.cast = cast;
    }
}
