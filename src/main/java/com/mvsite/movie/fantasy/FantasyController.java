package com.mvsite.movie.fantasy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	
	//Service 레이어인 FantasyService를 자동으로 주입받는다
	@Autowired
	private FantasyService fantasyService;
	
	//영화 목록페이지로 이동하는 get요청을 처리
	@GetMapping
	public String fantasyList() {
		return "fantasyList";//경로요청시 "fantasy.html"페이지를 보여줌
	}
	
	
	//APT요청을 처리하고 jsn형식으로 영화  목록을 반환
	@GetMapping("api")
	@ResponseBody
	public List<Movie> getFantasyList(){
		return fantasyService.getFantasyList();//Service레이어에서 영화 목록을 받아옴
	}
	
	//특정 ID의 영화 정보를 가져와서 디테일 페이지에 전달 
	@GetMapping("/{id}")
	public String getFantasy(@PathVariable("id") Integer id, Model model) {
	    Movie movie = fantasyService.getFantasy(id);//ID로 영화정보를 찾는다
	    model.addAttribute("movie",movie);//영화데니터를 모델에 추가하여 뷰에 전달 한다
	    return "fantasyDetail";//"fantasyDetail.html"뷰를 반환한다
	}
	
	
	//새로운 영화를 생성하는 API 처리한다
	@GetMapping("/create")
	@ResponseBody
	public void createMovieAPI(@RequestBody Movie movie) {
		System.out.println(movie);
		fantasyService.createMovieAPI(movie);//요청 본문에서 영화 데이터를 받아 생성
	}
	
	
	//영화 삭제 요청을 처리 한다 
	@DeleteMapping("/detail/{id}")
	public String deleteMovie(@PathVariable("id") Integer id) {
		fantasyService.deleteMovie(id);
		return "redirect:/fantasy";
	}

}
