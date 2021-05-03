package day6;

public class MathodEx1 {

	public static void main(String[] args) {
		//메소드 예제
		//메소드명(값);
		System.out.println(add(1,3));
		add2(1,2);
		printMultiTable(8);
		int num1 = 8,  num2 = 12;
		int res = gcd (num1, num2);
		System.out.println(num1 + "와 " + num2 + "의 최대 공약수 : " + res);
		
	}
	/*  메소드 생성 방법!
	 * 기능 	  : 두 정수가 주어지면 두 정수의 합을 알려주는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 정수의 합  => 정수 int 
	 * 메소드명 : add 
	 * 
	 *///		변수타입 메소드명   매개변수 
	public static int add(int num1, int num2) {
		 //          정수의 합 
		 int res = num1 + num2;
		return res;
	}
	/*  메소드 생성 방법!
	 * 기능 	  : 두 정수가 주어지면 두 정수의 합을 콘솔에 출력 하는 메소드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 없음 >= void
	 * 메소드명 : add2 
	 * 
	 *///		변수타입 메소드명   매개변수 
	public static void add2(int num1, int num2) {
		int res = num1 + num2;
		System.out.println(num1 + "+ " + num2 + " = " + (num1+num2));
		
	}
	
	/*  기  	능 : 두 정수와 산술 연산자가 주어지면 두 정수에 산술 연산 결과를 알려주는 메소드
	 *  매개변수 : int calcuate(int num1, char op, int num2){  
	 *  리턴타입 : 연산 결과 > 실수 > double
	 *  메소드명 :calcuate  
	 *  		reture res;
	 */
	public static double calcuate(int num1, char op, int num2) {
		 return 0.0;
		/* 기능 : 두 정수의 최대 공약수를 알려주는 메소드
		 * 매개변수 : int num1, int num2,
		 * 리턴타입 : int
		 * 메소드명 : gcd 
		 */
	}
	
	public static int gcd(int num1, int num2) {
		int i, gcd = 0;
		for(i =1; i<= num1 ; i+=1)
			if(num1 % i == 00 && num2 % i == 0) {
				gcd = i;
			}				return gcd;



	}		

	/* 	기능 	: num단을 출력 하는 메소드
	 * 매개변수 	: int i 
	 * 리턴타입	:  없음
	 * 메소드명 	: printMultiTable 
	 * */
	 ///	    	변수타입   메소드명   매개변수 
	 
	public static void printMultiTable( int num){
		int i;
		 for(i = 1; i <=9 ; i+=1) {
			 System.out.println( i + "X" + i + "= " + (num*i) );	 
	
		 }
	
	}
	

	
}
