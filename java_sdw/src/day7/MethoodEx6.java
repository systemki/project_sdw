package day7;

public class MethoodEx6 {

	public static void main(String[] args) {

		star('*',2 );
		print	
	}
		// star();
		/* 다음과 같이 출력 하는 메소드를 만드세요.
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 *  다음과 같이 출력하는 메소드를 만드세요.
		 *      *
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 *      
		 */
//여기
	
		
//여기 까지 
		

		
		
		 

	}
	/* 매개변수 : int i, int k
	 * 리턴타입 : x void star
	 * 메소드명 : star
	 *  
	 */

	public static void star(int i, int k) {
		for(k = 1 ; k <= 5 ; k += 1 ) {
			// 공백
			for( i = 1 ; i <= 5 - k  ; i += 1 ) {
				System.out.print("*");
			}
			//별 
			for( i = 1 ; i <= k ; i += 1 ) {
				System.out.print(" ");
			}
			
			System.out.println();
	}	
		
	}
	
	
		/* 기능 : 주어진 문자를 이용하여 n줄 삼각형 출력 하는 메소드
		 * 매개 변수 : 문자, n줄, 삼각형 종류 > char ch, int n ??
		 * 리턴 타입 : 없음 > void
		 * 메소드명  : printTriagle
		 * 
		 */
	public static void printTriangle(char ch, int n, TriangleShape shape) {
	 switch(shape) {
	 case LEFT_TRIANGLE:
		 printTleftangle(ch, n);
		 break;
	 case RIGHT_TRIANGLE:
		 printTriangle(ch, n);
	 }
	}
	
enum TriagleShape{LEFT_TRIANGLE,  RIGHT_TRIAnGLE}
		
		
		

