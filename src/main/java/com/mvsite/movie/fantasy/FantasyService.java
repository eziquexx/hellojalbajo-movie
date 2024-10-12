package com.mvsite.movie.fantasy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.movie.Movie;

@Service
public class FantasyService {
	@Autowired
	private FantasyMapper fantasyMapper;
	
	public List<Movie> getFantasyList(){
		return fantasyMapper.getFantasyList();
		}
	public Movie getFantasy(Integer id) {
		return fantasyMapper.getFantasyByid(id);
	}
	public void createMovieAPI(Movie movie) {
		fantasyMapper.insertMovie(movie);
	}
	public void deleteMovie(Integer id) {
		fantasyMapper.deleteMovieById(id);
	
	}
}
