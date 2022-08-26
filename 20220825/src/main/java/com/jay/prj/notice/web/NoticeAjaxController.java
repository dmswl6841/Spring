package com.jay.prj.notice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jay.prj.notice.service.NoticeService;
import com.jay.prj.notice.service.NoticeVO;

@RestController //@controller + @ResponseBody 호출한 페이지로 결과를 돌려준다
public class NoticeAjaxController {
	@Autowired
	private NoticeService ajaxService;
	
	@RequestMapping("/ajaxSearch.do")
	public List<NoticeVO> ajaxSearch (@RequestParam String key, @RequestParam String val){
		System.out.println("ajaxSearch.do 성공");
		System.out.println("key : " +key+"val : "+val);
		return ajaxService.noticeSearch(key, val);
	}
}
