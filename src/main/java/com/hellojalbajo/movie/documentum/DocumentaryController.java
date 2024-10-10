package com.hellojalbajo.movie.documentum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hellojalbajo.movie.Genre;
import java.util.List;

@Controller
@RequestMapping("/documentary")
public class DocumentaryController {

    @Autowired
    private DocumentaryService documentaryService;

    @GetMapping
    public String getDocumentaryList(Model model) {
        List<Genre> documentaries = documentaryService.getDocumentaryList();
        model.addAttribute("documentaries", documentaries);
        model.addAttribute("title", "다큐멘터리 목록");
        return "documentaryList";
    }
}
