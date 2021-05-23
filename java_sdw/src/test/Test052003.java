package test;

import java.util.Scanner;

public class Test052003 {

	public static void main(String[] args) {
	
		
	Scanner scan = new Scanner (System.in);	
System.out.println(" 소문자 변환 1번 : ");
System.out.println(" 대문자 변환 2번 : ");
	String num = scan.next();

	
	if(num.equals("1")) {
		System.out.println("대문자 대입해주세요. ");
		String	num2 = scan.next();
		System.out.println(num2.toLowerCase());
	}else if(num.equals("2")) {
		System.out.println("소문자 대입해주세요");
		String num3 = scan.next();
		System.out.println(num3.toUpperCase());
	}
	

	scan.close();
	}
}


	