package edu.kosmo.kyw.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.kosmo.kyw.mapper.MemberMapper;
import edu.kosmo.kyw.vo.MemberCustom;
import edu.kosmo.kyw.vo.MemberVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

/*
 * username을 가지고 사용자 정보를 조회하고 session에 저장될 사용자 주체 정보인 
 * UserDetails를 반환하는 Interface다.
 */

@Log4j
@Service
public class MemberCustomDetailsService implements UserDetailsService  {
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		log.warn("Load User By UserVO number: " + username);
		MemberVO vo = memberMapper.getUser(username);

		log.warn("queried by UserVO mapper: " + vo);

		return vo == null ? null : new MemberCustom(vo);		
	}
}