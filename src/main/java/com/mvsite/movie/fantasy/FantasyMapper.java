package com.mvsite.movie.fantasy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mysite.movie.Movie;

@Mapper
public interface FantasyMapper {
	List<Movie> getFantasyList();
	
	Movie getFantasyByid(Integer id);
	
	void insertMovie(Movie movie);
	
	void deleteMovieById(Integer id);

}
