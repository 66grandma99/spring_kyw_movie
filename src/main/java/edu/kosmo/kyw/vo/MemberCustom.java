package edu.kosmo.kyw.vo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Getter
@Setter
public class MemberCustom extends User {
	
	@Setter(onMethod_ = @Autowired)
	private MemberVO member;
	   
	public MemberCustom(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public MemberCustom(MemberVO member) {

		super(member.getUsername(), member.getPassword(), getAuth(member));

		this.member = member;
	}

	public static Collection<? extends GrantedAuthority> getAuth(MemberVO memberVO) {

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		for (AuthVO auth : memberVO.getAuthList()) {
			authorities.add(new SimpleGrantedAuthority(auth.getAuthority()));
		}

		return authorities;
	}
}
