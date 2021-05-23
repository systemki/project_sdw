package test;

import java.util.Scanner;

public class Test052001 {

	public static void main(String[] args) {
		// 내용이 맞는 안맞는지 확인 
		System.out.println("신동우".equals("신동우"));
		System.out.println("신동우" .indexOf("신동우"));
		System.out.println("신동우" .indexOf("신동욱"));
		System.out.println("제이름은 신동우 입니다. " .replace("신동우","신동욱"));
		
		System.out.println("두단어를 입력하세요 :");
		Scanner scan = new Scanner (System.in);
		
		
		String str1 = scan.next();
		String str2 = scan.next();
		String str3 = scan.next();
		
		
		System.out.println(str1.replace(str2, str3));
		
		
		
//		if(str1.indexOf(str2) == -1) {
//			System.out.println("포함" + str1.length());
//		}else {
//			System.out.println("포함 안함");
//		}
////		
//		
		
//		
//		System.out.println(str1.equals(str2));
//		
//		if(str1.equals(str2)) {
//			System.out.println("내용" + str1+"과" + "진실");
//		}else {
//			System.out.println("내용" + str2+"과" + "거짓");
//		}
		
	}

}
