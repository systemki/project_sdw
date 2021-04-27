package day2;

import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
// 스캐너 스캔 = 뉴 스캐너 (시스.인)
		/* 두정수를 입력 받아 입력받은 두정수의 산술 연산 결과를 출력 하는 예제 
		두 정수를 입력 하세요 : 12
		 1 + 2 = 3
		 1 - 2 = -1
		 1 * 2 = 2
		 1 / 2 = 0.5
		 1 % 2 =1
		  
		*/
		
		int num, num2;
		System.out.println("두 정수를 입력 하세요:");

		num= scan.nextInt();
		num2= scan.nextInt();
		System.out.println(num + " + " + num2 + " = " +(num + num2));
		System.out.println(num + " - " + num2 + " = " +(num - num2));
		System.out.println(num + " * " + num2 + " = " +(num * num2));
		System.out.println(num + " / " + num2 + " = " +((double)num / num2));
		System.out.println(num + " % " + num2 + " = " +(num % num2));

		
		scan.close();

	}

	
}
