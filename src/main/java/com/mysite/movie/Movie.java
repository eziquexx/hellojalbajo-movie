package com.mysite.movie;

public class Movie {
	private int id; //영화 ID, 데이터 베이스 고유 식별값
	private String moviename;
	private String production_year;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getProduction_year() {
		return production_year;
	}
	public void setProduction_year(String production_year) {
		this.production_year = production_year;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descrption) {
		this.description = description;
	}
	
	
}
