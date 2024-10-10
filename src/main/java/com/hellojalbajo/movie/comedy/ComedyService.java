package com.hellojalbajo.movie.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojalbajo.movie.Movie;

@Service
public class ComedyService {
	@Autowired
	private ComedyMapper comedyMapper;
	
	// list
	public List<Movie> getComedyList() {
		return comedyMapper.getComedyList();
	}
	
	// detail
	public Movie getComedy(Integer id) {
		return comedyMapper.getComedyById(id);
	}
	
	// create
	public void createMovieAPI(Movie movie) {
		comedyMapper.insertMovie(movie);
	}
	
	// delete
	public void deleteMovie(Integer id) {
		comedyMapper.deleteMovieById(id);
	}
}
