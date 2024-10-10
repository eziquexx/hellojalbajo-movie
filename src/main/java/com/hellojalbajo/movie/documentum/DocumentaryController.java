package com.hellojalbajo.movie.documentum;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.hellojalbajo.movie.Movie;

import java.util.List;

@Controller
@RequestMapping("/documentary")
public class DocumentaryController {

    @Autowired
    private DocumentaryService documentaryService;

    @GetMapping
    public String getDocumentaryList(Model model) {
        List<Movie> documentaries = documentaryService.getDocumentaryList();
        model.addAttribute("documentaries", documentaries);
        model.addAttribute("title", "다큐멘터리 목록");
        return "documentaryList";
    }
    @GetMapping("/create")
//    @ResponseBod

        public String create(){
        return "documentaryCreate";
    }
    @PostMapping("/create")
    @ResponseBody
    public void make(@RequestBody Movie movie){
        documentaryService.setMovieInfo(movie);
    }
    
    //detail
    @GetMapping("/{id}")
    public String getDocumentary(@PathVariable("id") Integer id, Model model) {
    	Movie movie = documentaryService.getDocumentary(id);
    	model.addAttribute("movie", movie);
    	return "documentaryDetail2";
    }
}


