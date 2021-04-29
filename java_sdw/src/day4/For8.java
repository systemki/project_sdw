package day4;

import java.util.Scanner;

public class For8 {

	public static void main(String[] args) {
		/* a부터 z까지 출력하는 코드를 작성하세요. 
		 반복 횟수는 i는 0부터 i는 26보다 작을때까지  i는 1씩 증가
		 규칙성 :  (char) ('a'+i) 출력 
		 반복문 :  없음 
		 
		*/
		
		Scanner scan =  new Scanner(System.in);
		int i = scan.nextInt();
		
			
				
		for(i = 0; i < 26 ; i += 1 ) {
			System.out.print((char)(+'a'+ i)+ " ");
			
		} 
	
		char ch;
		System.out.println();
		for(ch = 'a' ; ch <= 'z' ; ch += 1) {
			System.out.print(ch+ " ");
			
			
		}

	}

}
