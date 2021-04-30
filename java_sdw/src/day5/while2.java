package day5;

public class while2 {

	public static void main(String[] args) {
		// while 문과 continue를 이용한 짝수 출력 예제
		int i = 1, num = 10;
		while(i < num) {
			if(i % 2 != 0 ) {
				i += 1;
				continue;  //조건식으로 올라감 
			}
			System.out.print(i + "");
			i += 1;  
		}   System.out.println();
			
		while(++i < num) {
			if(i % 2 != 0 ) {
				i += 1;
				continue; // 조건식으로 올라감 
			}
			System.out.print(i + "");
			i += 1;  
		}
		
		
		// for문을 while으로 변경하기 
		
		
		
	}

}
