package com.hellojalbajo.movie.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@ResponseBody
	public Movie getComedy(@PathVariable("id") Integer id) {
		return comedyService.getComedy(id);
	}
}
