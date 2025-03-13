package org.thebest.lessons.java.best_of_the_year.classes;

public class Song extends AbstractContenuto {
    String author;

    public Song(int id, String title, int year, String image, String author) {
        super(id, title, year, image);
        
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
