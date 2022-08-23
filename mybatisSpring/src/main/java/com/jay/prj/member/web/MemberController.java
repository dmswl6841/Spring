package com.jay.prj.member.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jay.prj.member.service.MemberService;
import com.jay.prj.member.vo.MemberVO;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;	//dao를 통해 Reopsitory에서 결과를 가져온다.
	
	@RequestMapping("/memberList.do")
	public String memberSelectList(Model model) {
		//service 객체를 호출해서 값을 가져오게 처리
		model.addAttribute("members", service.memberSelectList());
		//service.memberSelectList()를 members(변수명, jsp에서 쓰인다.)에 넣는다.
		return "member/memberList";
	}
	
	@RequestMapping("/memberSelect.do")
	public String memberSelect(MemberVO vo, Model model) {
		model.addAttribute("member", service.memberSelect(vo));
		return "member/memberSelect"; 
	}
	
	@RequestMapping("/memberInsert.do")
	public String memberInsert(MemberVO vo, Model model) {
		int n = service.memberInsert(vo);
		if(n!=0) {
			model.addAttribute("message", "정상적으로 추가되었습니다.");
		}else {
			model.addAttribute("message", "ERROR! 오류가 발생하여 추가하지 못하였습니다.");
		}
		return "member/memberInsert";
	}
	
	@RequestMapping("/memberDelete.do")
	public String memberDelete(MemberVO vo, Model model) {
		int n = service.memberDelete(vo);
		if(n!=0) {
			model.addAttribute("message", "정상적으로 삭제되었습니다.");
		}else {
			model.addAttribute("message", "ERROR! 오류가 발생하여 삭제하지 못하였습니다.");
		}
		return "member/memberDelete";
	}
	
	@RequestMapping("/memberUpdate.do")
	public String memberUpdate(MemberVO vo, Model model) {
		int n = service.memberUpdate(vo);
		if(n!=0) {
			model.addAttribute("message", "정상적으로 수정되었습니다.");
		}else {
			model.addAttribute("message", "ERROR! 오류가 발생하여 수정하지 못하였습니다.");
		}
		return "member/memberUpdate";
	}
}
