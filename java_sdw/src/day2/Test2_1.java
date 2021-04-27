package day2;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in); 
		
		/* 국어, 영어, 수학 성적을 입력 받아 출력 하세요.
		 * 단, 성적은 0~100점 사이의 실수 */
	/*	
		System.out.println("국어 성적을 입력하세요");
		double kor = scan.nextInt();
		System.out.println("국어 성적 값 입니다."+kor);
		
		System.out.println("영어 성적을 입력하세요");
		double eng = scan.nextInt();
		System.out.println("영어 성적 값 입니다."+eng);
		
		
		System.out.println("수학 성적을 입력하세요");
		double math = scan.nextInt();
		System.out.println("수학 성적 값 입니다."+math);
		*/
		
		double kor, eng, math;
		System.out.print( "국어, 영어, 수학, 성적을 입력하세요:");
		
		kor= scan.nextDouble();
		eng= scan.nextDouble();
		math= scan.nextDouble();

		System.out.println("국어"+ kor +"점");
		System.out.println("영어"+ eng +"점");
		System.out.println("수학"+ math +"점");
		
		
		scan.close();
		
		
	}

}
