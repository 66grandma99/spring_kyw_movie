package edu.kosmo.kyw.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.kyw.vo.ImageVO;



@Mapper
public interface ImageMapper {

	ImageVO getMovie(int movie_id);

}
