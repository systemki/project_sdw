package day4;

import java.util.Scanner;

public class Test4_4 {

	public static void main(String[] args) {
		/* 램덤으로
		 * 
		 */
		int min = 1, max = 20, num ;
		//Math.radom()은 보다 크거나 같고 1보다 작은 임의의 실수를 생성하는 기능
		// 0 <= A <1
		// 0 *(max - min + 1) <= A * (max - min
		int r =(int)(Math.random() * (max - min + 1) +min);
		/* 정수를 램덤으로 생성하여 생성된 숫자를 맟추는 게임
		 * 예시 : (랜덤하게 생선된 숫자가 25인 경우)
		 * 정수가 램덤으로 생성되었습니다. 게임 시작!
		 * 정수를 입력하세요 1~100 : 100
		 * down 
		 * 정수를 입력하세요 1~100 : 40
		 * down 
		 * 정수를 입력하세요 1~100 : 10
		 * up
		 * 정수를 입력하세요 1~100 : 20
		 * up
		 * 정수를 입력하세요 1~100 : 25
		 * 정답입니다.
		 * 반복횟수 : X
		 * 규칙성  : 정수를 입력하세요라는 문자열 출력
		 * 			콘솔에서 정수를 입력 받음
		 * 			입력 받은 정수가 램덤한 수가 크면 down 이라고 출력하고
		 * 			작은면 up이라고 출력하고 
		 * 			같으면  정답 입니다. 출력후 종료 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.print("정수를 입력하세요1~100");	
		//	정수를 입력하세요라는 문자열 출력
			num = scan.nextInt();
		//	  			콘솔에서 정수를 입력 받음
			 if( num > r ) {
				 System.out.println("down");
			 }if(num < r) {
				System.out.println("up");
			 }if(num == r) {
				 System.out.println("정답");
				 break;
			 }	 
			}
		}
		
		scan.close();
		
	}


