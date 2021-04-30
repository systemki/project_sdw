package day5;

import java.util.Scanner;

public class Test5_3 {

	public static void main(String[] args) {
		// 콘솔에서 정수를 5번 입력 받아 값을 출력하는 코드를 작성하세요
		
		Scanner scan = new Scanner (System.in); 
		int i;
		int [] arr = new int[5];
		for(i = 0 ; i <arr.length  ; i +=1) {
			System.out.print("입력: ");
		 arr[i] = scan.nextInt();
		System.out.println("출력 : " +arr[i]);
	
		}
		
		scan.close();
		
		

	}

}
