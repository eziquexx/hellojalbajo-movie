package com.hellojalbajo.movie.comedy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComedyService {
	@Autowired
	private ComedyMapper comedyMapper;
	
	public List<ComedyDTO> getComedyList() {
		return comedyMapper.getComedyList();
	}
}
