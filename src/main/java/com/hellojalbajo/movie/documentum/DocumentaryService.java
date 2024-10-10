package com.hellojalbajo.movie.documentum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojalbajo.movie.Movie;

@Service
public class DocumentaryService {
    @Autowired
    private DocumentaryMapper documentaryMapper;

    public Movie getDocumentary(Integer id) {
        return documentaryMapper.getDocumentaryById(id);
    }

    public List<Movie> getDocumentaryList() {
        return documentaryMapper.getDocumentaryList();
    }
    public void setMovieInfo(Movie movie){
        documentaryMapper.setMovieInfo(movie);
    }
    }
