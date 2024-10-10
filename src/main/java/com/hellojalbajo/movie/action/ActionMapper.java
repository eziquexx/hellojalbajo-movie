package com.hellojalbajo.movie.action;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hellojalbajo.movie.Movie;


@Mapper
public interface ActionMapper {

    public List<Movie> getMovieList();
    public Movie getMovieById(int id);
    public void setActionMovie(Movie movie);
}
