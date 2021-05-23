package test;

public class Lotto {

	public static void main(String[] args) {
		/* 사용자 번호를 램덤으로 생성하고, 당첨 번호를 입력 하면 당첨
		 * 등수를 출력하는 코드를 작성하세요.
		 * 사용자 번호 : 1 ~ 45사이의 수, 중복되지 않음 6개
		 * 당첨번호 : 1~45 사이의 수, 중복되지 않음, 6개 + 1개(보너스)
		 * 1등 : 6개 일치
		 * 2등 : 5개 + 보너스 번호 일치
		 * 3등 : 5개 일치
		 * 4등 : 당첨번호 4개
		 * 5등 : 당첨번호 3개
		 * 꽝  : 당청번호 2개 이하 
		 * 
		 */
		//자동생성 번호 만듬
		int []user = new int[6];
		System.out.println(contains(int[]arr, 1, 40));
		
	}
	
	public static boolean contains(int[]arr, int count, int num) {
		for(int i = 0; i < count ; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
}
