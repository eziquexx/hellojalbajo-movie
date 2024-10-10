package com.hellojalbajo.movie.documentum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojalbajo.movie.Genre;

@Service
public class DocumentaryService {
    @Autowired
    private DocumentaryMapper documentaryMapper;

    public Genre getDocumentary(Integer id) {
        return documentaryMapper.getDocumentaryById(id);
    }

    public List<Genre> getDocumentaryList() {
        return documentaryMapper.getDocumentaryList();
    }
}
