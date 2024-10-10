package com.hellojalbajo.movie.musical;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicalService {
	@Autowired
	private MusicalMapper musicalMapper;
	
	// 데이터베이스에서 값을 가져오는 것
	public Musical getMusical(Integer id) {
		return musicalMapper.getMusicalById(id);
		//return "Hello World";
	}
	
	public List<Musical> getMusicalLimit10() {
		return musicalMapper.getMusicalLimit10();
	}
	
	public void createMusical(Musical musical) {
		musicalMapper.insertMusical(musical);
	}
}