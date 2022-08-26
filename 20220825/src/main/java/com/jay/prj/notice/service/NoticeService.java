package com.jay.prj.notice.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Update;

public interface NoticeService {
	List<Map<String,Object>> noticeSelectList(); //join, 또는 VO객체를 만들지 않고 사용할 때 쓸 수 있다.
//	List<NoticeVO> noticeSelectListVO(); //VO객체를 이용해서 받을 때
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	int noticeHitUpdate(NoticeVO vo);
	List<NoticeVO> noticeSearch(String key, String val);
}
