package com.jay.prj.notice.service;

import java.sql.Date;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeVO {
	private int noticeId;
	private String noticeWriter;
	private String noticeTitle;
	private String noticeSubject;
	private Date noticeDate;	//시분초가 중요 -> java.util, 중요X -> java.sql
	private int noticeHit;
	private String noticeAttech;
	private String noticeAttechDir;	
}
