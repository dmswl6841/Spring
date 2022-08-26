package com.jay.prj.notice.web;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.jay.prj.notice.service.NoticeService;
import com.jay.prj.notice.service.NoticeVO;

@Controller
public class NoticeController {
	@Autowired
	private NoticeService ns;
	
	@Autowired
	private ServletContext serveletContext;
	
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(NoticeVO vo ,Model model) {
		model.addAttribute("n", ns.noticeSelect(vo));
		ns.noticeHitUpdate(vo);
		return "notice/noticeSelect";
	}
	
	@GetMapping("/noticeSelectList.do")
	public String noticeList(Model model) {
		model.addAttribute("notices", ns.noticeSelectList());
		return "notice/noticeSelectList";
	}
	
	@PostMapping("/noticeInsert.do")
	public String noticeInsert(NoticeVO vo, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		//fileUpload 처리
		String saveFolder = serveletContext.getRealPath("fileUpload"); //저장 할 폴더 명
		File sfile = new File(saveFolder); //실제 저장할 물리적 위치
		String oFileName = file.getOriginalFilename(); //넘어온 파일의 이름
		if(!oFileName.isEmpty()) {
			String sFileName = UUID.randomUUID().toString() + oFileName.substring(oFileName.lastIndexOf("."));
			//파일명 충돌방지를 위한 파일 별명만듦
			file.transferTo(new File(sfile, sFileName)); //파일을 물리적 위치에 저장
			vo.setNoticeAttech(oFileName);
			vo.setNoticeAttechDir(saveFolder +File.separator+ sFileName); //fileUpload/5464(랜덤).text
			System.out.println(File.separator);
		}
		ns.noticeInsert(vo);
		return "redirect:noticeSelectList.do";
	}
	
	@RequestMapping("/noticeUpdate.do")
	public String noticeUpdate(NoticeVO vo) {
		ns.noticeUpdate(vo);
		return "redirect:noticeSelectList.do";
	}
	
	@RequestMapping("/noticeSearch.do")
	public String noticeSearch(NoticeVO vo, String key, String val, Model model)  {
		model.addAttribute("notices",ns.noticeSearch(key, val));
		return "notice/noticeSearch";
	}
	
	@RequestMapping("/noticeForm.do") //입력 폼 호출
	public String noticeForm() {
		return "notice/noticeForm";
	}
	
	@RequestMapping(value="/ajaxNoticeSelect.do", produces ="application/text; charset=UTF-8")
	@ResponseBody //호출한 페이지로 결과를 돌려보내준다
	public String ajaxNoticeSelect(HttpServletResponse rs) {
		String message = "ajax Test를 한번 해봅니다.";
		return message;
	}
	
	@GetMapping("/ajaxTest.do")
	public String ajaxTest() {
		return "notice/ajaxTest";
	}
	
	
}
