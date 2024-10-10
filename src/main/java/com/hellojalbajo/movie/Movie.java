package com.hellojalbajo.movie;

public class Movie {
   
    private int id;
    private String movieName;
    private String productionYear;
    private String description;

    //Getter
    public int getId(){
        return id;
    }

    public String getMovieName(){
        return movieName;
    }

    public String getProductionYear(){
        return productionYear;
    }

    public String getDescription(){
        return description;
    }

    //Setter
    public void setId(int id){
        this.id = id;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    
    public void setProductionYear(String productionYear){
        this.productionYear = productionYear;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
}
