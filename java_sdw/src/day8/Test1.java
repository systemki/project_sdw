package day8;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		System.out.println("월 마지막 일수를 입력 하세요");
		Scanner scan = new Scanner (System.in);
		
		int num = scan.nextInt();
		if(num == 1 && num == 3 && num == 5 && num == 7 && num == 8 && num == 10 && num == 12) {
			System.out.println("31일 입니다.");
		}else if(num == 4 && num == 6 && num == 9 && num == 11) {
		System.out.println("30일 입니다.");
		}else if(num ==2) {
			System.out.println("2월은 28일 입니다");
		
			scan.close();
		}
		
	}
}

