package edu.kosmo.kyw.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.kosmo.kyw.vo.MemberVO;

@Mapper
public interface MemberMapper {

	int insertMember(MemberVO memberVO);

}
