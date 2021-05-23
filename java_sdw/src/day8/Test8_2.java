package day8;

public class Test8_2 {

	public static void main(String[] args) {
	/* 
	 * 다음과 같이 출력 되도록 작성하세요.
	 * a
	 * ab
	 * acde
	 * abcd xyz..
	 * 
	 * 
	 * 
	 */

		  char i = 0;
			for(i = 65 ; i < 91 ; i+=1) {
				for(char k = 65; k < i ; k+=1) {
					System.out.print(k);
				}
				System.out.println(i);
			}
		
		
	}

	
	
	
}
