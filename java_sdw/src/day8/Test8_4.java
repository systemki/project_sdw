package day8;

import java.util.Scanner;

public class Test8_4 {

	public static void main(String[] args) {
		/* 4개의 성적을 입력 받아 합격인지 불합격인지 판별하는 코드를 작성하세요.
		 * 합격 기준
		 * - 모든 성적이 과락이 없어야 함
		 * - 평균 60점 이상
		 *  예시1 (과락이 있는 경우)
		 *  성적이 40점 미만인 경우 
		 *  성적 : 40 30 100 100
		 *  불합격 입니다.
		 *  
		 *  성적 : 60 40  100 100
		 *  합격 입니다.
		 *  예시2 (평균이 60만 인경우)
		 *  성적 : 40 50 40 60
		 *  
		 */
		int arr[] = new int[4];
		Scanner scan = new Scanner (System.in);		
		for(int i = 0; 1 < arr.length ; i+=1) {
			arr[i] = scan.nextInt();
		}			
		scan.close();
		
//		합격 여부 결정
		int sum = 0;
		boolean pass = true;  // true :  합격,  
		for(int tmp : arr) {
			sum += tmp;
		}
		double avg = (double)sum / arr.length;
		if(avg < 50) {
			pass = false;
			
		}
//		평균이 60점 이상
//		과학이 있는지 없는지 
		
		for(int tmp : arr) {
			if(tmp < 40) {
			pass = false;
			}
		}
		if(pass){
			System.out.println("합격 입니다.");		
		}else{
			System.out.println("불합격 입니다.");
		}
	}
}
