package day3;

public class For4_1 {

	public static void main(String[] args) {
		// 1부터 10까지의 짝수 들만 출력 하는 코드를 작성 하요
		
	/*	
		int i;	
		for(i = 2; i <= 10; i++, i++) {
			
			System.out.println(i);
		
		       
			   int k;			   
			   for(k = 1 ; k <= 10; k++) {
			   System.out.println(k*2);
		
			 */ 
			//방법 1 : 1부터 10까지 다 확인 한 후 짝수들만 출력 
			int i;
			for(i = 2; i <=10; i++) {
				if(i % 2 == 0) {
					System.out.print(i + " ");
				}
				
				for(i = 2; i <=10; i=i+2) {
					System.out.print(i + " ");
				}
		}
		
	}

}
