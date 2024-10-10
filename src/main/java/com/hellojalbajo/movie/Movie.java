package com.hellojalbajo.movie;

public class Movie {
   
    private int id;
    private String moviename;
    private String production_year;
    private String description;

    //Getter
    public int getId(){
        return id;
    }

    public String getMovieName(){
        return moviename;
    }

    public String getProduction_year(){
        return production_year;
    }

    public String getDescription(){
        return description;
    }

    //Setter
    public void setId(int id){
        this.id = id;
    }

    public void setMovieName(String moviename){
        this.moviename = moviename;
    }
    
    public void setProductionYear(String production_year){
        this.production_year = production_year;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
}
