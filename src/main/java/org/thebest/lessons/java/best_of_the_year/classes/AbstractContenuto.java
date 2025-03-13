package org.thebest.lessons.java.best_of_the_year.classes;

public abstract class AbstractContenuto {
    protected int id;
    protected String title;
    protected int year;
    protected String image;

    public AbstractContenuto(int id, String title, int year, String image) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
