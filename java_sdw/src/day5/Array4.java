package day5;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		/* 정수 num의 약수를 배열에 저장한 후 출력하는 코드를 작성하세요.
		 * 단, 약수의 갯수가 10개를 넘어가는 경우 최대 10개만 출력하면 됩니다.
		 * 
		 */
		int i, cnt;
		Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력");
	int num = scan.nextInt();
	 for(i = 1; i < num; i+=1) {
		 if(num % i == 0) { // num를 i로 나누엇을 때 나머지가 0 같으면
			 int [] cnt =new int[10]; // 배열 cnt 
		 i = cnt [];  //cnt번지에 i를 저장 후 
		 cnt c+=1 //cnt 1 증가 후 
				if(;cnt = 10; ){ // cnt가 10과 같으면 반복문 종료 
					 break;
					 System.out.println("출력"+cnt[0]); // cnt개 출력
				 }
					 
				 }
	 }
	 }
		 /*
	if()
	int [] arr = new int [10];
	arr[i] = num;
		System.out.println(i);
	}*/
	
	}


