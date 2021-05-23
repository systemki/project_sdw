package day15;
//회원과 관련된 처리를 하는 기능들을 모아놓은 인터페이스
		//목차 개념 
public interface UserService {
	
	/* 기 능   : 회원의 아이디와 비밀번호가 주어졌을때 로그인 기능 여부를 
	 * 			알려주는 메소드 
	 * 매개변수 : 아이디, 패스워드
	 * 리턴타입 : return 결과확인 보냄 t/f > boolean
	 * 메소드명 : login
	 * 
	 */
	 	//리턴 타입 메소드명:();
	
	boolean login(String id, String pw);
	

	/* 기 능   : 회원 아이디 , 비밀번호, 이메일, 전화번호가 주어지면 
	 * 			해당 정보로 회원가입 하여 가입여부를 알려주는 메소드
	 * 매개변수 : 아이디, 패스워드, 이메일, 전화번호  
	 *  		> 회원 정보 > User user 
	 * 리턴타입 : 회원 가입 성공 여부  결과확인 보냄 t/f > boolean
	 * 메소드명 : signup
	 */
	
	 boolean signup(User user);
	
	/* 기 능   : 회원의 이메일, 전화번호를 수정하는 메소드
	 * 매개변수 : 이메일 주소, 전화번호 수정 
	 * 			> 회원정보 > User user 
	 * 리턴타입 : 없음 > void 
	 * 메소드명 : modifyUser
	 */
	
	 void modifyUser(User user);
	 
}

class User{
	String id;
	String email;
	String num;
}

