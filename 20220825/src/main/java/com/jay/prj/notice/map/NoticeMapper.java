package com.jay.prj.notice.map;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jay.prj.notice.service.NoticeVO;

public interface NoticeMapper {
	
	@Select("select * from notice") //이렇게 해도 되지만 권장하지않음
	List<Map<String,Object>> noticeSelectList();
	
	NoticeVO noticeSelect(NoticeVO vo);
	int noticeInsert(NoticeVO vo);
	int noticeUpdate(NoticeVO vo);
	int noticeDelete(NoticeVO vo);
	
	List<NoticeVO> noticeSearch(@Param("key") String key, @Param("val") String val);
	//*****mapper interface에서만!!!!***** 전달인자가 두개 이상의 값이 넘어오면 @param을 해줘야한다. 그래야 구분할 수 있음.
}
