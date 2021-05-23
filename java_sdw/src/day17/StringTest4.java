package day17;

import java.util.Scanner;

public class StringTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("제이름은 임꺽정입니다.".replace("임꺽정","홍길동"));
		
		/* 문자열C 입력 받고, 해당 단어에 문자열 A와 문자열 B를 입력 받아
		 * 문자열C 있는 문자열 A를 문자열 B로 봐꾸는 코드를 작성하세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.next();
		
		System.out.println(str1.replace(str1, str2));{
		
//		if(str3 != null && str3.indexOf(str1) !=-1) {
//			
//			str3 = str3.replace(str1, str2);
//			System.out.println("봐뀐단어 " + str3);
//		}else {
//			System.out.println("단어를 봐꿀 수 없다 ");
//		}

		scan.close();
		}
	}		
		
}

