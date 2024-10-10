package com.hellojalbajo.movie.musical;

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
@RequestMapping("/musical")
public class MusicalController {

	@Autowired
	private MusicalService musicalService;
	
	//detail
	@GetMapping("/{id}")
	public String getMusical(@PathVariable("id") Integer id, Model model) {
		// Integer id = 1;
		Movie movie= musicalService.getMusical(id);
		model.addAttribute("movie", movie);
		return "musicalDetail";
	}
	
	
	//List
	@GetMapping("/api")
	@ResponseBody
	public List<Movie> getMusical() {
		return musicalService.getMusicalLimit10();
	}
	
	@GetMapping
	public String getList() {
		return "musicalList2";
	}
	
	
	
	@GetMapping("/create")
	public String create() {
		return "musicalCreate";
	}

	@PostMapping
	@ResponseBody
	public void createMusical(@RequestBody Movie movie) {
		musicalService.createMusical(movie);
	}
	
	
}
