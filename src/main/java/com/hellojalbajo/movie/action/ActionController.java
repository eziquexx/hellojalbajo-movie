package com.hellojalbajo.movie.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hellojalbajo.movie.Movie;

@Controller
@RequestMapping("action")
public class ActionController {

    @Autowired
    private ActionService _service;

    @GetMapping("list")
    @ResponseBody
    public List<Movie> GETActionMovieList(){

        return _service.getActionMovieList();
    }

    @GetMapping("{id}")
    @ResponseBody
    public Movie GETActionMoive(@PathVariable("id") int id){

        return _service.getActionMovie(id);
    }

    @PostMapping("create")
    public void POSTSetActionMovie(@RequestBody Movie movie){
        _service.setActionMovie(movie);
    }

    @GetMapping
    public String GETMovieListPage(Model model) {
        model.addAttribute("title","action");
        model.addAttribute("lstData",_service.getActionMovieList());
        return "MovieList";
    }

}
