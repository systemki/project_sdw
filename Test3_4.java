package day3;

import java.util.Scanner;

public class Test3_4 {

	public static void main(String[] args) {
		/* 두정수와 산술연자를 입력 받아 계산 결과를 출력하는 예제를 
		 * switch문을 작성하세요. */
		System.out.println("정수와 산술연자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		char op = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		switch(op) {
		case '+':
		System.out.println("" +num1 + op + num2 + "=" + (num1 + num2));
		break;
		case '-':
		System.out.println("" +num1 + op + num2 + "=" + (num1 - num2));
		break;
		case '*':
		System.out.println("" +num1 + op + num2 + "=" + (num1 * num2));
		break;
		case '%':
		System.out.println("" +num1 + op + num2 + "=" + (num1 % num2));
		break;
		case '/':
		System.out.println("" +num1 + op + num2 + "=" + ((double)num1 / num2));
		break;
		default:
			System.out.println(op+"는 산술연산자가 아닙니다.");
		}
	}

}
