package day1;

public class Varlable1 {

	
	
	
	public static void main(String[] args) {
		//정수형 변수 선언
		//변수 타입 변수명
		byte num1 = 1;
		short num2 = 32767;
		int num3 =  2147483647;
		long num4 = 2147483668l;
		// long 타입 숫자 뒤에는 L을 붙여야 함, 숫자가 int범위보다 클때 
		char ch1 ='한';
		int num5 = 0b111; //  정수 앞에 0b를 붙이면 2진수, 2진수 111=>10진수 7
		int num6 = 0111; // 정수 앞에 0을 붙히면 8진수, 8진수 111=>10진수 73
		int num7 = 0x111; // 정수 앞에 0x 붙이면 16진수, 16진수 111=>10진수 273
		int num8 = 111; // 정수 앞에 아무것도 안붙이면 10진수 
		
	
		System.out.println(num5); // 
		System.out.println(num6);// 
		System.out.println(num7);//
		System.out.println(num8);//
		
		 float dnum1 = 1.12345678901234567F;
		 double dnum2 = 1.12345678901234567;
		 System.out.println(dnum1);
		 System.out.println(dnum2);
	
		boolean stop = true;
		boolean state = false;
		String str ="Hello";
		System.out.println(str);
		
/*
 * byte num1 = 1;


기본 변수 타입 
 

문자열 변수 타입(String : 클래스) 문자열에 사용한다.
기본 타입이 아니지만 문자열 사용할때 쓴다. 

 변수는 일반 변수 , 참조변수가 있다.
 일반변수는 기본탑입을 이용하여 생산한 변수
 그렇지 않은 경우 참조변수 

변수타입에 종류
 정수형 : byte, short, int, long, char
 실수형 : float, double
 논리형 : boolean 
 동일한 변수명은 중복선언 불가


 * 
 */
	}

}
