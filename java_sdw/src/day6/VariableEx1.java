package day6;

public class VariableEx1 {
	static int num =10; //VariableEx1 클래스의 멤버변수 num
	public static void main(String[] args) {
		/* 지역변수 : 우리가 지금 까지 사용한 일반 변수, 특정 지역에서만 가능한 변수
			- 서언된 위치부터 해당 {}안 끝까지 사용 가능 
		 * 멤버변수 : 클래스안에 변수로, 해당 클래스의 모든 곳에서 사용 가능
		 */
		int i; /* 10번째 21번째 줄까지 사용 가능 i는 main메소드 안에서 
		          서언 하였기 떄문에 main 메스드 끝까지 사용가능 */  
		for(i = 1; i <=5 ; i +=1) {
			System.out.println("*");
		}
		System.out.println(i);
		for(int k=1; k<= 5; k+=1) { //  k는  17번쨰부터 18번째 까지 사용 가능 
			System.out.println("*");
		}
		System.out.println(i);
		System.out.println(num);
	}

	public static void test() {
		i = 10; //에러 발생 : test메소드에서 i라는 변수를 선언 하지 않았기 때문에
		System.out.println(num);
	}
}
