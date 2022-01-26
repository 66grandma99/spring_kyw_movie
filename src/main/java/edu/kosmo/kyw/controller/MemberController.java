package edu.kosmo.kyw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.kosmo.kyw.service.MemberService;
import edu.kosmo.kyw.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping(value = "/loginForm")
	public String loginForm(MemberVO memberVO, Model model) {
		log.info("loginForm()...");
		

		return "/login/login_form";
	}
	
	@GetMapping(value = "/adduser")
	public String adduser(MemberVO memberVO, Model model) {
		log.info("adduser()...");
		log.info("memberVO==========" + memberVO);
		
		int result = memberService.addMember(memberVO);
		
		log.info("memberService.addMember" + result);
		
		return "movie_index";
	}
	
}
