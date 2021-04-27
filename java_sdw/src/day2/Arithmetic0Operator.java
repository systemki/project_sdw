package day2;

public class Arithmetic0Operator {

	public static void main(String[] args) {
		// 산술 연산자 나누기 / 예제
		System.out.println(" 1 / 2 =" + 1 / 2 );
		System.out.println(" 1 / 2 =" + 1.0 /2);
		System.out.println(" 1 / 2 =" + 7 /4.0);
		System.out.println(" 1 / 2 =" + 3.0 /2.0);
		int num1 =1, num2=2;
		//정수 에서 실수로 변환 
		System.out.println((double)num1 /num2);
		System.out.println("7 % 4 =" + 7 % 4);
		char ch =65;
		
		// char + int =>int가 되어서 char에 그냥 저장할 수 없음
		// 강제 타입 변환을 해야한다.
		ch =(char)(ch +43);
		
		System.out.println(ch);

	
	
	}

}
