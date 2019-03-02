package com.example.myapplication.model;

public class Movie {
    private String Title;
    private String Year;
    private String imdbID;
    private String Poster;

    public Movie() {

    }

    public Movie(String Title, String Year, String imdbID, String Poster){
        this.Title = Title;
        this.Year = Year;
        this.imdbID = imdbID;
        this.Poster = Poster;
    }

    public String getTitle() {
        return Title;
    }

    public String getYear() {
        return Year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getPoster() {
        return Poster;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setYear(String year) {
        Year = year;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }
}
