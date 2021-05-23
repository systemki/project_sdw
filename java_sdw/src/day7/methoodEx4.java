package day7;

public class methoodEx4 {

	public static void main(String[] args) {
		gcd1(2, 3);
	}
		/* 
		 * 기 능  : 두 정수의 최대 공약수를 알려주는 메소드 
		 *  매개변수 : 두 정수 > int num1, int num2
		 *  리턴타입 : 최대 공약수 > 정수 > int
		 *  메소드명 : gcd1
		 */
		public static int gcd1(int num1, int num2) {
			int res = 1;
			for(int i =1 ; i <num1; i+=1) {
				if(num1 % i == 0 && num2 % i == 0) {
					res = i;
					return res;
				}

	
		/* 
		 * 기 능  : 두 정수의 최대 공약수를 출력하는 메소드 
		 *  매개변수 : 두 정수 > int num1, int num2
		 *  리턴타입 : 없음 > void 
		 *  메소드명 : gcd2
		 */
		

