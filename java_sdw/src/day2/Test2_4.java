package day2;

import java.util.Scanner;

public class Test2_4 {

	public static void main(String[] args) {
		/* 입력받은 정수 num가 3의 배수 인지 아닌지 출력 하는 코듣 작성 하세요.
		 예시
		 정수를 입력하세요 : 6
	 	 6은 3의 배수 입니다.
		 예시 
		 정수를 입력하세요. : 4
		 4는 3의 배수가 아닙니다.		
		*/

				
		System.out.println("정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		if(num % 3 == 0  ) {
			System.out.println("6은 3의 배수 입니다.");
			
		}else {
			System.out.println(num + "는 3배 아닙니다.");
		}
			scan.close();

	}
}

