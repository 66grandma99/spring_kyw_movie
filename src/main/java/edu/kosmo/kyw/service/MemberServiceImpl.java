package edu.kosmo.kyw.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.kosmo.kyw.mapper.MemberMapper;
import edu.kosmo.kyw.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MemberServiceImpl implements MemberService{	
	
	@Inject
	private BCryptPasswordEncoder passEncoder;
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public int addMember(MemberVO memberVO) {
		
		String password = memberVO.getPassword();
		String encode = passEncoder.encode(password);
		memberVO.setPassword(encode);

		//userMapper.insertAuthorities(userVO);
		
		return memberMapper.insertMember(memberVO);
	}	

}
