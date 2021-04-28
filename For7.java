package day3;

import java.util.Scanner;

public class For7 {

	public static void main(String[] args) {
		
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 약수 : 나누어서 떨어지는 수
		 * 6의 약수 : 1,2,3,6
		 * 공약수 : 공통으로 있는 약수 
		 * 8의 약수 : 1, 2, 4, 8
		 * 12의 약수 1, 2, 3, 4, 6, 12
		 * 8과 12의 공약수 : 1, 2, 4
		 * 최대 공약수 : 공약수 중 가장 큰수 
		 * 8과 12의 최대 공약수 : 4
		 * 두 정수 : num, num2
		 * 반복횟수 : i는 1부터 num1까지 1씩 증가 
		 * 규칙성 : i 가 num의 약수 이고 i가 num2의 약수이면
		 * 			i를 변수 gcd에 저장
		 * 			=>num을  i로 나누었을 때 나머지가 0과 같고
		 * 			  num2를 i로 나누어었 때 나머지가 0과 같고
		 * 			  i를 변수 gcd에 저장 
		 * 반복문 종료 후 : gcd를 출력 
		 * 
		 */
		
			int i, gcd = 1 ,  num = 8, num2 = 12  ;
			
			for(i = 1; i <= num ;  i += 1) {
				 // 반복횟수 : i는 1부터 num1까지 1씩 증가 
		
				if(num % i == 0 && num2 % i ==0) {
					gcd = i;
					
				}
					//num를 i로 나누었을때 나머지가 0과 같다면 
			}	System.out.println(num + " 과 " + num2 + "의 최대 공약수 : " + gcd);
				// i는 1부터 num까지 1씩 증가
				

	}

}
