package com.hellojalbajo.movie.fantasy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellojalbajo.movie.Movie;


//비즈니스 로직을 처리. 여기서는 데이터 베이스와의 연결을 담당
@Service
public class FantasyService {
	@Autowired
	private FantasyMapper fantasyMapper;
	
	
	//도든 영화 목록을 반환하는 메서드
	public List<Movie> getFantasyList(){
		return fantasyMapper.getFantasyList(); //	Mapper를 호출하여 데이터 베이스에서 영화 목록을 받아옴
		}
	
	//특정 ID의 영화를 반환하는 메서드
	public Movie getFantasy(Integer id) {
		return fantasyMapper.getFantasyById(id);//ID를 기준으로 영호를 조회
	}
	
	//새로운 영화를 생성하는 메서드
	public void createMovieAPI(Movie movie) {
		fantasyMapper.insertMovie(movie);//영화 데이터를 데이터 베이스에 삽입
	}
	
	//특정 ID의 영화를 삭제하는 메서드 
	public void deleteMovie(Integer id) {
		fantasyMapper.deleteMovieById(id);//ID를 기준으로 영화를 삭제
	
	}
}
