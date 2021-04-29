package day4;

public class For14 {

	public static void main(String[] args) {
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수 : 약수가 2개인 수를 소수 
		 * 소수 : 2 3 5 7 11 13 17 ...
		 * 반복횟수 : i는 1부터 i는 num보다 작거나 가을때 까지  
		 * 규칙성  : i가 num의 약수이민 약수의 갯수 cnt 를 1증가 
		 * 			>num 를 i를 나워었을때 0같다면 cnt 1증가 
		 * 반복분 종료 후 : 약수의 갯수가 2개이면 소수라고 출력하고 
		 * 					아니면 소수가 아님이라고 출력 
		 * 
		 * 
		 */

		int num = 4, i, cnt = 0; 
		
		for(i = 1 ; i <= num ; i+=1 ) {
			if(num % i == 0) {
				cnt += 1;
						
			}
		}
		if(cnt == 2) {
			System.out.println(num+"는 소수");
		}else {
			System.out.println(num + "소수가 아님 ");
		}
		}
	}

