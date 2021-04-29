package day4;

public class Test4_1 {

	public static void main(String[] args) {
		// 11부터 20까지 출력 하는 코드를 작성하세요.
		// 반복 횟수 :  i 11부터 i는 20보다 작거나 같을때 까지 i 는 1씩 증가
		// 규칙성 :  i는 콘솔에 출력
		// 반복문 종료 후 : 없음
		
		int i;
		for(i = 11 ; i <=20 ; i+=1){ //반복횟수
			System.out.print(" " + i);
		}
		//20부터 20까지 출력 하는 코드를 작성하세요
		// 반복 횟수 : i는 20부터 i는 11 보다 크거나 같을떄 경우 i는 1씩 감소
		// 규칙성 : i 는 콘솔 출력
		// 반복 문 없음
		System.out.println();

		for(i = 20 ; i >= 11 ; i-= 1) {
			System.out.print(" "+  i);
		}
		/* 1부터 100까지 숫자 중 일의자리가 3, 6, 9 끝나는 수들을 출력하는 코드를 작성하세요
		 * 규 칙 성  : i 는 10으로 나누엇을떄 나머지가 3과 같거나
		 * 		 	 i 는 10으로 나누엇을떄 나머지가 6과 같거나
		 * 		  	 i 는 10으로 나누엇을떄 나머지가 9과 같거나
		 * 
		 * 반복 문 종료 후 :
		 */
		System.out.println();
		int k;
		for(i = 1, k=0; i <= 100 ; i+= 1) {
			if( i  % 10 == 3 ||  i  % 10 == 6 || i  % 10 == 9) {

						System.out.print(  i + " ");
						k += 1;
						if(k % 3 == 0) {
							System.out.println();
						}
						
			}
		} 
	}

}
