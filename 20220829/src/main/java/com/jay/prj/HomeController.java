package com.jay.prj;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jay.prj.member.service.MemberService;

@Controller
public class HomeController {
	
	@Autowired
	private MemberService service;

	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		return "home/home";
	}
	
	@RequestMapping("/home.do")
	public String home() {
		return "home/home";
	}
	
	@GetMapping("/charts.do")
	public String charts() {
		return "home/chart";
	}
}
