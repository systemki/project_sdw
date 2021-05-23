package day8;

public class Test4_7 {

	public static void main(String[] args) {
		/* 5개 짜리 배열에 같은 숫자가 몇개 있는지 없는지 판별하는 코드를 작성.
		 * 단, 숫자는 정렬되어 있다고 가정 
		 * 예시 : 1 1 2 3 4
		 * 1
		 * 
		 * 예시 : 1 2 3 4 5 
		 * 0

		 * 예시 : 1 1 2 2 4
		 * 2
		 * 
		 * 예시 : 1 1 1 2 3
		 * 0
		 * i번지의 값과 +1번지의 값이 같으면 cut 1증가 
		 * 다르면 cnt 값이 2와 같으면 res를 ture수정
		 *      cnt를 1로 초기화
		 *      반복문 종료 후 
		 *      res가 true이면 있음이라고 출력
		 *      flase이면 없음
		 */

	//5개 짜리 배열 생성 
          //예시 1 1 2 3 4 
		int arr[] = new int [] {1,1,2,2,4};
		int cnt = 1;
		int res = 0; // 숫자가 2개 있다면 몇개 있는지를 판별하는 코드를 작성  
		// 투루면 있고 없으며 일치가 없는거임 
		for(int i = 0; i < arr.length -1; i+=1) {
		if(arr[i] == arr[i+1]) {
			cnt +=1;
		}else {
		}if(cnt == 2) {
			res = i+=1;
		}
		cnt = 1;
		}
		if(cnt ==1) {
			res +=1;
		}
		System.out.println(res);
		}
		
	}



