package com.hellojalbajo.movie;

public class Genre {

    private Integer id;
    private String moviename;
    private String production_year;
    private String description;

    // Getter and Setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for moviename
    public String getMovieName() {
        return moviename;
    }

    public void setMovieName(String moviename) {
        this.moviename = moviename;
    }

    // Getter and Setter for production_year
    public String getProductionYear() {
        return production_year;
    }

    public void setProductionYear(String production_year) {
        this.production_year = production_year;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}