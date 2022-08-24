package com.jay.prj.notice.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeVO {
	private int notice_id;
	private String notice_writer;
	private String notice_title;
	private String notice_subject;
	private Date notice_date;
	private int notice_hit;
	private String notice_attech;
	private String notice_attech_dir;
}
