package com.hellojalbajo.movie.musical;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MusicalMapper {

	Musical getMusicalById(Integer id);
	List<Musical> getMusicalLimit10();
	void insertMusical(Musical musical);
}