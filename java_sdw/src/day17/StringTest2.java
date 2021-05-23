package day17;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class StringTest2 {
	public static void main(String[] args) {
		System.out.println("홍길동".equals("홍길동"));
		
		/* 두 단어를 입력 받아 두 단어가 같은 단어 인지 확인 하는 코드를 작성하세요.
		 * 
		 */
		
		
		System.out.println("두단어를 입력하세요(예: abc cde) :");
		Scanner scan = new Scanner (System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		
		System.out.println(str1.equals(str2));
		
		if(str1 != null && str1.equals(str2)) {
			System.out.println("단어" + str1 + "과단어" + str2 + "는 같은");
		}else {
			System.out.println("단어" + str1 + "과단어" + str2 + "는 다름");
		}
		scan.close();
	}
	
	
}
