package day4;

public class Test4_2 {

	public static void main(String[] args) {
		/* 1부터 10까지에 짝수들을 continue 이용 하여 출력 하는 코드를 작성하세요
		 */
		
		int i;
		for(i = 1 ; i <=10 ; i+=1 ) {
		if(i == 1 || i == 3|| i == 5 || i == 7|| i == 9) { // (i % 2 == 1)
			continue;
		} System.out.println(i);
		}

	}

}


