package day2;

import java.util.Scanner;

public class Test2_3 {

	public static void main(String[] args) {
		// 국어 성적을 입력 받고 국어 과목을 패스 했는지 안했는지 확인하는 코드 를 작성하세요.
		// 국어 성적이 60점 미만이면 fail, 국어성적이 60점 이상이면 pass
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("국어 점수를 입력하세요:");
		num= scan.nextInt();
		
		
		/*
		System.out.println("수학 점수를 입력하세요:");

		num2= scan.nextInt();

		
		System.out.println("영어 점수를 입력하세요:");

		num3= scan.nextInt();

		*/
		
	//	String result = (num >= 90) && (num <=100) ? " A " : " ";

	//	System.out.println("국어 성적은 A학점 인가? " + result);
		
		String result2 = 90 <= num && num <= 100 ? "A" : (
				80 <= num && num < 90 ? "B" : (
				70 <= num && num < 80 ? "C" : (
				60 <= num && num < 70 ? "D" : "F")));
				System.out.println( "영어점수는 " + result2);
		
								
		
		
		
	/* 조건선택자 연산자를 통해 국어 성적의 학점을 출력 하는 코드를 작성하세요. */
		
		
		/*
		String result3 = (num3 >= 60) ? " Pass " : "Fail";
		System.out.println( "영어점수는 " + result3);
		*/ 
		
		/* 국어 성적이 A학점인지 아닌지 판별하는 코드를 작성 하세요.
		 * A학점은 90점 이상 100점 이하 
		 */
		
		scan.close();


		
	}

}
