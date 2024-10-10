package com.hellojalbajo.movie.musical;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hellojalbajo.movie.Movie;

@Mapper
public interface MusicalMapper {

	Movie getMusicalById(Integer id);
	List<Movie> getMusicalLimit10();
	void insertMusical(Movie movie);
}