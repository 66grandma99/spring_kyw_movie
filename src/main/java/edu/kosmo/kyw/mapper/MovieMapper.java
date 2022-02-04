package edu.kosmo.kyw.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.kyw.vo.MovieVO;



@Mapper
public interface MovieMapper {

	MovieVO getMovie(int movie_id);

}
