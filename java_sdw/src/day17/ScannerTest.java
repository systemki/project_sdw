package day17;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		/* next()	  : 공백(엔터, 스페이스)을 만나기전까지 문자열을 가져오는 메소드
		 * nextLine() : 처음 만나는 엔터전까지  문자열을 가자오는 메소드 
		 * 
		 */
		Scanner scan = new Scanner("1234 1234\n4567\n78910\n");
		while(scan.hasNext()) {
			String str = scan.nextLine();
			if(str.length() != 0) {
				System.out.println(str);
			}
			
			
		}
		//		//String str = scan.next();
//		String str = scan.nextLine();	// 1234 1234 
//		System.out.println(str);
//		System.out.println("----");
//		str = scan.nextLine();			//4567
//		System.out.println(str);
//		int num = scan.nextInt();		//8910
//		System.out.println(num);
//		System.out.println("----");
//		str = scan.nextLine();			// 빈공백을 추출 
//		System.out.println(str);
//		System.out.println("----");
//		scan.close();
		
	}
		
}
