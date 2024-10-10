package com.hellojalbajo.movie.documentum;

import com.hellojalbajo.movie.Movie;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocumentaryMapper {
    Movie getDocumentaryById(Integer id);
    List<Movie> getDocumentaryList();
    void setMovieInfo(Movie movie);
}



