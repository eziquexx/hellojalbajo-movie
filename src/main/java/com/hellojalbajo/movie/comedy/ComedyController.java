package com.hellojalbajo.movie.comedy;

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
@RequestMapping("/comedy")
public class ComedyController {
	@Autowired
	private ComedyService comedyService;
	
	// comedy list
	@GetMapping
	public String comedyList() {
		return "comedyList";
	}
	@GetMapping("/api")
	@ResponseBody
	public List<Movie> getComedyList() {
		return comedyService.getComedyList();
	}
	
	// comedy detail
	@GetMapping("/{id}")
	public String getComedy(@PathVariable("id") Integer id, Model model) {
		Movie movie = comedyService.getComedy(id);
		model.addAttribute("movie", movie);
		return "comedyDetail";
	}
	
	// movie - comedy insert
	@GetMapping("/create")
	public String createMovie() {
		return "comedyCreate";
	}
	@PostMapping("/create")
	@ResponseBody
	public void createMovieAPI(@RequestBody Movie movie) {
		comedyService.createMovieAPI(movie);
	}
	
	
	// movie - comedy delete
	@PostMapping("/delete/{id}")
	public String deleteMovie(@PathVariable("id") Integer id ) {
		comedyService.deleteMovie(id);
		return "redirect:/comedy";
	}
	
}
