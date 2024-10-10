package com.hellojalbajo.movie.comedy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hellojalbajo.movie.Movie;

@Mapper
public interface ComedyMapper {

	// list
	List<Movie> getComedyList();
	
	// detail
	Movie getComedyById(Integer id);
}
