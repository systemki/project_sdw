package day17;

import java.util.Scanner;

public class StringTest7 {

	public static void main(String[] args) {
		/* String str = "1234-567-1564";
		String []arr = str.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		 취미를 한줄로 입력 받아 
		 취미를 입력하세요(예 : 영화보기, 음악감상,독서 )
		 예시 
		 */
		 
		Scanner scan = new Scanner (System.in);
		
		System.out.println("취미를 입력하세요 : (예 : 영화보기,헬스,운동 )");
		String str = scan.next();
		String arr[] = str.split(",");
		for(int i = 0; i<str.length(); i++) {
			System.out.println((i+1) + " ." + arr[i]);
		}
		
		scan.close();
	
		
	}

}
