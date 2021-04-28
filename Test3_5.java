package day3;

import java.util.Scanner;

public class Test3_5 {

	public static void main(String[] args) {
		/* 월의 마지막일수를 출력하는 예제를 switch문으로 작성하세요.
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11
		 * 28 : 2
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		int num = scan.nextInt();		
		switch(num) {
		case 1, 3, 5, 7, 8, 10, 12:			
		System.out.println("31일 입니다.");
			break;
		case 4, 6, 9, 11:			
		System.out.println("30일 입니다.");
			break;
		case 2:			
		System.out.println("28일 입니다.");
			break;
			default:
			System.out.println("실행문이 없음");
		}
		
	}

}
