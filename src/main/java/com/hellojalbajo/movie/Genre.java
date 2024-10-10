package com.hellojalbajo.movie;

public class Genre {
    private Integer id;
    private String moviename;
    private Integer production_year; // 필드 이름 확인
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public Integer getProductionYear() {
        return production_year;
    }

    public void setProductionYear(Integer productionYear) {
        this.production_year = production_year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
