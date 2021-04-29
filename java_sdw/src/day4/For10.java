package day4;

import java.util.Scanner;

public class For10 {

	public static void main(String[] args) {
		/* 반복 횟수가 정해지 않는 예제
		 * 콘솔에서 q나 Q를 입력 받을 때 까지 반복하는 예제
		 * 
		 */
		
		Scanner scan =  new Scanner(System.in);
		
		char ch = 'a';
		for(  ; ch != 'q' && ch != 'Q' ; ) {
			System.out.print("알파벳을 입력하세요(종료하려면 q/Q 입력) : ");
			ch = scan.next().charAt(0);
		}
		
		
		
		
		scan.close();
		
		
	} //String 끝나는 

} //클래스 쪽 
