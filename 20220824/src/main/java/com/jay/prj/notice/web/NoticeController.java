package com.jay.prj.notice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.jay.prj.notice.service.NoticeService;
import com.jay.prj.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService service;
	
	@RequestMapping("/noticeList.do")
	public String noticeSelectList(Model model) {
		model.addAttribute("notices", service.noticeSelectList());
		return "notice/noticeList";
	}

	@RequestMapping("/noticeSelect.do") //위의 코드와 같음. 요새는 잘 안씀. 있다고 알아두기
	public ModelAndView noticeSelect(ModelAndView mv) {
		mv.addObject("notices", service.noticeSelectList()); //결과를 담고
		mv.setViewName("notice/noticeList"); //view 선택
		return mv;
	}
	
	@RequestMapping("/noticeForm.do") //입력 폼 호출
	public String noticeForm() {
		return "notice/noticeForm";
	}
	
	@PostMapping("/noticeInsert.do")
	public String noticeInsert(NoticeVO vo, MultipartFile mFile) {
		//여기에서 첨부파일 처리
		System.out.println("작성자 : "+vo.getNotice_writer());
		System.out.println("제목 : "+vo.getNotice_title());
		System.out.println("내용 : "+vo.getNotice_subject());
		System.out.println("작성일자 : "+vo.getNotice_date());
		service.noticeInsert(vo); //글 내용 등록
		return "redirect:noticeList.do"; //글 목록으로 돌아가기
		//redirect는 handler mapper로 보냄 -> noticeInsert.do 실행 후 noticeList.do를 실행
	}
}
