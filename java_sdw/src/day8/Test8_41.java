package day8;

public class Test8_41 {

	public static void main(String[] args) {
	/* 1부터 10까지 한줄로 출력 하는 코드를 작성하세요.
	 *  다음과 같이 되도록 코드를 작성하세요.
	 */
		
		
		System.out.println("\n-------------------");
		int i ;
		for(i = 1; i <= 12 ; i += 1) {
			System.out.print( " ");
//			i가 홀수이면 i+1 출력, i짝수이면 i-1출력
			if(i % 2 == 1) {
			System.out.print(i+1 + " ");
			}else {
				
				System.out.print(i-1 + " ");
			}
			
			if(i % 4 == 0) {
				System.out.println();
			}
		
		}
	}
}

