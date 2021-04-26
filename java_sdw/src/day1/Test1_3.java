package day1;

import java.util.Scanner;

public class Test1_3 {

	public static void main(String[] args) {
		// 두 정수와 문자를 입력 받아 출력 하는 예제를 작성하세요
		/* 정수1을 입력하세요 :  1
		 * 문자를 입력하세요 : +
		 * 정수2를 입력하세요 2
		 * 1+2
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);  //암기 하기 
		
		
		System.out.print("정수를입력하세요 : "); 
		int num1 = scan.nextInt(); //콘솔에서 입력받은 중에 정수 값을 받아옴 
		System.out.println("입력받은 값 : " +num1);
	
		
		
		/*
		System.out.print("문자열 입력하세요 : "); 
		String str1 = scan.next();
		System.out.println("입력받은 값 : " +str1);		
		
	*/
		
		System.out.print("문자를입력하세요 : "); 
		char dnum2 = scan.next().charAt(0); //콘솔에서 입력받은 중에 문자 값을 받아옴 
		//scan.next():문자열을 읽어옴
		//문자열.charAt(0) : 해당 문자열 중에 첫번째 글자를 읽어옴
		System.out.println("입력받은 값 : " +dnum2);		
	
	
		
		System.out.print("정수를입력하세요 : "); 
		int num2 = scan.nextInt(); //콘솔에서 입력받은 중에 정수 값을 받아옴 
		System.out.println("입력받은 값 : " +num1+dnum2+num2);
		
		

		System.out.println("두 정수와 문자를 입력하세요 :");
		num1 = scan.nextInt();
		dnum2 = scan.next().charAt(0);
		num2 = scan.nextInt();
		
		/*
		
		System.out.print(" 두 정수와 문자를 입력하세요 : "); 
		String str3 = scan.next();
		System.out.println("입력받은 값 : " +str3);		
		

		*/
		
		
		scan.close();

		
	}

}
