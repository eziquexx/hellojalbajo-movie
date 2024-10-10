package com.hellojalbajo.movie.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojalbajo.movie.Movie;

@Service
public class ComedyService {
	@Autowired
	private ComedyMapper comedyMapper;
	
	public List<Movie> getComedyList() {
		return comedyMapper.getComedyList();
	}
}
