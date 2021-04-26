package day1;

import java.util.Scanner;
//import 가줘오다 위에 파일명 

public class Input {

	public static void main(String[] args) {
		/* 콘솔창에서 입력받아 변수에 저장하는 예제 */
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("정수를입력하세요 : "); 
		int num = scan.nextInt(); //콘솔에서 입력받은 중에 정수 값을 받아옴 
		System.out.println("입력받은 값 : " +num);
		
		System.out.print("실수를입력하세요 : "); 
		double dnum = scan.nextDouble(); //콘솔에서 입력받은 중에 실수 값을 받아옴 
		System.out.println("입력받은 값 : " +dnum);
		
		
		System.out.print("문자를입력하세요 : "); 
		char dnum2 = scan.next().charAt(0); //콘솔에서 입력받은 중에 문자 값을 받아옴 
		//scan.next():문자열을 읽어옴
		//문자열.charAt(0) : 해당 문자열 중에 첫번째 글자를 읽어옴
		System.out.println("입력받은 값 : " +dnum2);		
		
		
		System.out.print("문자열 입력하세요 : "); 
		/* nextLine() : 공백을 포함한 문자열을 가줘옴  */
		String str1 = scan.next();
		System.out.println("입력받은 값 : " +str1);		
		
		
		
		scan.close();
		
		
	}

}
