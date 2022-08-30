package com.jay.prj.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
	
	@GetMapping("/memberLogin.do")
	public String memberLogin() {
		return "notiles/member/memberLoginForm";
	}
	
	@GetMapping("/memberJoin.do")
	public String memberJoinForm() {
		return "notiles/member/memberJoinForm";
	}
	
}
