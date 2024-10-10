package com.hellojalbajo.movie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojalbajo.movie.Movie;

@Service
public class ActionService {

    @Autowired
    private ActionMapper _mapper;

    public List<Movie> getActionMovieList(){

        return _mapper.getMovieList();
    }

    public Movie getActionMovie(int id){


        return _mapper.getMoviebyId(id);
    }

    public void setActionMovie(Movie movie){
        
        _mapper.setActionMovie(movie);
    }

}
