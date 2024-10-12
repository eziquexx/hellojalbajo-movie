package com.mvsite.movie.fantasy;

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

import com.mysite.movie.Movie;

@Controller
@RequestMapping("/fantasy")
public class FantasyController {
	@Autowired
	private FantasyService fantasyService;
	
	@GetMapping
	public String fantasyList() {
		return "fantasyList";
	}
	@GetMapping("api")
	@ResponseBody
	public List<Movie> getFantasyList(){
		return fantasyService.getFantasyList();
	}
	@GetMapping("/{id}")
	public String getFantasy(@PathVariable("id") Integer id, Model model) {
	    Movie movie = fantasyService.getFantasy(id);
	    model.addAttribute("movie",movie);
	    return "fantasyDetail";
	}
	
	@GetMapping("/create")
	@ResponseBody
	public void createMovieAPI(@RequestBody Movie movie) {
		System.out.println(movie);
		fantasyService.createMovieAPI(movie);
	}
	
	@PostMapping("/detail/{id}")
	public String deleteMovie(@PathVariable("id") Integer id) {
		fantasyService.deleteMovie(id);
		return "redirect:/fantasy";
	}

}
