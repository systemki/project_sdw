package day3;

import java.util.Scanner;

public class Test3_2 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 정수가 0, 양수, 음수인지 판별하는 
		 * 코드를 작성하세요. */
		System.out.println("정수를 입력하세요.");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num == 0){
			System.out.print("0");
		}else if(num > 0) {
			System.out.print("양수 입니다.");
		}else{
			System.out.print("음수 입니다.");
		}
		
		scan.close();

	}

}
