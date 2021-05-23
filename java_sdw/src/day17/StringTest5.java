package day17;

import java.util.Scanner;

public class StringTest5 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		//2번지 부터 마지막 번지까지 부분 문자열 생성 		
		System.out.println("안녕하세요".substring(2));
		//substring은 원본을 수정하는 것이 아니라 새로운 문자열을 생성
		System.out.println(str);
		//2번지 부터 3번지 전까지 2번지 까지 새로운 부분 문자열을 생성하는 코드  
		System.out.println(str.substring(2,3));
		
		/* 주민등록번호를 입력해서 생년 월일 부분을 추출 하여 년도 월 일 출력하는 코드를
		 * 작성하세요.
		 * 
		 * 예시				  012345678910  	
		 * 주민번호를 입력하세요 : 020101-3234567 
		 * 2002년 1월 1일 
		 * 
		 * 주민번호를 입력하세요 : 020101-2234567 
		 * 1902년 1월 1일 
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("주민번호: 입력하세요");
		String num = scan.next();
		String year = num.substring(0,2);
		String month = num.substring(2,3);
		String day = num.substring(4,6);
		String gen = num.substring(7,8);
		
		switch(gen) {
		case "1","2" : 
			year = "19" + year;
			break;
		case "3","4" : 
			year = "20" + year;
			break;
				
		}
		

		
//		if(32 == num.subSequence(7, 9)) {
//			System.out.println("2002");
//		}else {
//			System.out.println("1902");
//		}
			
		
//		System.out.print(num1.substring(0,4)+ " 년 " + num1.substring(5,6) + " 월 " + num1.substring(7,8) + " 일 " );
//		
//		String num2 = scan.next();
//		System.out.print(num2.substring(0,2)+ " 년 " + "19" + num2.substring(5,6) + " 월 " + num1.substring(7,8) + " 일 " );
//		//성별 번호에 따라 year앞에 19 또는 20을 붙이면 됨 
//		
		System.out.println(year + "년" + month + "월" + day + "일");
		scan.close();
	}

}
