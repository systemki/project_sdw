package day13;

public class VariableTest {

	public static void main(String[] args) {
		int num5 = 0; //  지역변수 정수 num5변수는 0으로 초기화 하였고  일반변수 
		String str3 = "Hello"; // 스트링변수에 hello 대입 참조변수 (클래스 만든것은 객체) : 참조이면서 객체 
		int []arr; //  배열에 생성 참조  , 참조변수, 지역 변수 
		Board[] board = new Board[5]; //참조변수, 배열, 지역변수 
	}
	
}




class A{
	int num1; // 클래스a 정수 num1; 선언 일반 // 객체멤버 변수 
	static int num2; //  멤버 정수 에 num2;선언 일반 //클래스 멤버변수 
	String str1; // 스트링에 str1 ; 선언 참조 // 객체 멤버 변수 
	static String str2; // 멤버 변수에 스트링2 선언 참조변수, 참조 객체 클래스 멤버 
	public A(int num3, int num4) { // a리턴에  멤버변수 정수 num3, 정수 num4 // 매개변수  
		num1 = num3;  // num1 = num3; 같다
		num2 = num4;  // num2 =  num4 같다.		
	}
}

