package com.hellojalbajo.movie.documentum;

import com.hellojalbajo.movie.Genre;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocumentaryMapper {
    Genre getDocumentaryById(Integer id);
    List<Genre> getDocumentaryList();
}
