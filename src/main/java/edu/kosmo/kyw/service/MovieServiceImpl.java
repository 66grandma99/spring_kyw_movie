package edu.kosmo.kyw.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.kosmo.kyw.mapper.MemberMapper;
import edu.kosmo.kyw.mapper.MovieMapper;
import edu.kosmo.kyw.vo.MemberVO;
import edu.kosmo.kyw.vo.MovieVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieMapper movieMapper;
	
	@Override
	public MovieVO getMovie(int movie_id) {
		
		return movieMapper.getMovie(movie_id);
	}	
	
	

}
