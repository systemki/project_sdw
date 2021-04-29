package day4;

public class For15 {

	public static void main(String[] args) {
		/* 100이하의 모든 소수를 출력 하는 코드를 작성 하세요.
		 * 
		 * 2 3 5 7 11 13 17 19 ...
		 *  >소수이면 숫자를 출력하고 아니면 아무것도 안함
		 *  
		 *  */
		int num = 5, i, cnt = 0; 
		/* num 1일 때 약수의 갯수 cnt는 1이 계산 
		 * 그리고 num가 2일때 약수의 갯수를 구할 떄 앞에서 구한 1의 약수의 갯수에다가 
		 * 누적 
		 */
		for(num = 1; num <= 100; num += 1 ) {

			for(i = 1 ,	cnt = 0; i <= num ; i+=1 ) {
				if(num % i == 0) {
					cnt += 1;
							
				}
			}
			if(cnt == 2) {
				System.out.print(num+ " ");
			}
		}
		
		
	}

}



