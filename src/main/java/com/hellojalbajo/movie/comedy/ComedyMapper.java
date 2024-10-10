package com.hellojalbajo.movie.comedy;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ComedyMapper {

	List<ComedyDTO> getComedyList();
}
