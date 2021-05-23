package day12;

public class InitalizeTest {

	public static void main(String[] args) {
		TestA ta = new TestA();
		System.out.println(ta.getNum());

	}
}
/* 객체 변수 초기화 순서
 * 1. 변수 선언시 기본값으로 초기화 
 *  -num는 0으로 초기화 
 * 2. 명시적 초기화
 *  -num는 1로 초기화
 * 
 * 3. 초기화 블록
 * 
 * 4. 생성자 초기화
 * - num는 2로 초기화
 * 
 */

class TestA{
	private int num = 1;
	//초기화 블록
	{
		num = 3;
	}
	
	 public TestA() {
		num = 2;
		
	}
	
	public int getNum() {
		return num;
	}
}