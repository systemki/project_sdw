package day8;

import java.util.Scanner;

public class Test8_1 {

	public static void main(String[] args) {
		/* 1~9 사이의 정수를 입력 받아 각 숫자가 몇번 입력 됐는지 출력하는 코드를 작성하세요.
		 * 
		 * -1 입력되면 반복문 종료하고 각 숫자가 몇번 입력 됬는지 출력 
		 * 예시
		 * 입력 : 1
		 * 입력 : 1
		 * 입력 : 9
		 * 입력 : 3
		 * 입력 : 2
		 * 입력 : -1
		 * 1 : 2번
		 * 2 : 1번
		 * 3 : 1번
		 * 4 : 0번
		 * 5 : 0번
		 * 6 : 0번
		 * 7 : 0번
		 * 8 : 0번
		 * 9 : 1번
		 * 
		 */
		// "1 ~ 9 사이에 추를 입력 하세요" 
	    int num; // 콘솔에 입력 값 
	    int arr[] = new int[10];
		Scanner scan =  new Scanner(System.in);
	    while(true) {
			System.out.println("1 ~ 9 사이에 수를 입력 하세요 : ");
			num = scan.nextInt();
			if(num < 1  || num > 9) {
				System.out.println("값을 잘못 입력");
				break;
			
			}	arr[num] += 1;
			
	    }
	    for(int i = 1 ; i< arr.length; i+=1) {
	    	System.out.println(i+ " : " + arr[i] + "번");
	    }
	    	
	


	    
		scan.close();

	}

}
