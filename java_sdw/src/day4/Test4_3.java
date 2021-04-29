package day4;

import java.util.Scanner;

public class Test4_3 {

	public static void main(String[] args) {
		/* 정수를 꺼꾸로 출력 하는 코드를 작성하세요
		 * 예시
		 * 정수를 입력하세요 : 1234
		 * 결과 : 4321 
		 * 정수를 입력하세요 : 120
		 * 결과 : 021
		 */

		Scanner scan = new Scanner(System.in);			
		System.out.print("정수를 입력하세요.");
		int num = scan.nextInt();
		System.out.print("결과 :");
		scan.close();

		for( ;  ;  ) {
			System.out.print(num % 10); //num를 10으로 나눈 나머지를 출력;
			num = num / 10; //num에 num를 10으로 나눈 몫을 저장;
			if(num == 0) {
				break;
			}
			
		}
		
		
		
	}

}
