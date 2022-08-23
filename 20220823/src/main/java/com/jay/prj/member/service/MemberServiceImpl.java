package com.jay.prj.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.prj.member.map.MemberMapper;
import com.jay.prj.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	//의존주입, 바로 다음줄만 적용
	@Autowired
	private MemberMapper map;
	//IoC에서 자동으로 mybatis mapper를 주입해주는 것
	
	@Override
	public List<MemberVO> memberSelectList() {
		//전체 멤버 목록 조회
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		//멤버 한명의 정보 조회
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		//멤버 추가
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		//멤버 수정
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		//멤버 삭제
		return map.memberDelete(vo);
	}
}
