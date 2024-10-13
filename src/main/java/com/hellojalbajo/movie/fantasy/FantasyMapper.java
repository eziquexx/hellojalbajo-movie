package com.hellojalbajo.movie.fantasy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hellojalbajo.movie.Movie;

@Mapper//MyBatis 매퍼 인터페이스임을 나나냄
public interface FantasyMapper {
	List<Movie> getFantasyList();//모든 영화를 조회하는 메서드
	
	Movie getFantasyById(Integer id);//특정 id의 영화를 조회하는 메서드
	
	void insertMovie(Movie movie);//새로운 영화를 삽입하는 메서드 
	
	void deleteMovieById(Integer id);//특정 id의 영화를 삭제하는 메서드

}
