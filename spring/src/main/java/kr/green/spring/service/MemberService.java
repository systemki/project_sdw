package kr.green.spring.service;

import kr.green.spring.vo.MemberVO;

public interface MemberService {
	  public MemberVO getMember(String id);

	public MemberVO signin(MemberVO user);

	boolean signup(MemberVO user);
	  

}
