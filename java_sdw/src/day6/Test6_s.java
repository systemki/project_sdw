package day6;

import java.util.Scanner;

public class Test6_s {

	public static void main(String[] args) {
		/* 숫자 야구 게임 
		 *  - 1 ~ 9 사이의 중복되지 않은 3개의 정수를 랜덤으로 생성
		 *  - B : 숫자는 있지만 위치는 다른 경우
		 *  - S : 숫자도 있고, 위치가 같은 경우
		 *  - O : 일치하는 숫자가 하나도 없는 경우
		 *  예시 : 3 9 5
		 *  입력 하세요 : 1 2 3
		 *  1B
		 *  입력 하세요 : 4 5 6
		 *  1B
		 *  입력하세요 : 3 4 5
		 *  2S
		 *  입력하세요 : 3 5 9
		 *  1S2B
		 *  입력하세요 : 6 7 8
		 *  O
		 *  입력하세요 : 3 9 5
		 *  3S
		 *  정답입니다.
		 */
		int []com = new int[3];//컴퓨터가 랜덤으로 생성한 숫자를 저장하는 배열
		int []user = new int[3];//사용자가 입력한 숫자를 저장하는 배열
		int strike = 0;//스트라이크 갯수
		int ball;//볼의 갯수
		int cnt = 0;//컴퓨터가 랜덤으로 생성한(중복되지 않은) 숫자를 배열에 저장한 갯수
		int min = 1, max = 9;//랜덤 숫자 범위
		int r;//랜덤으로 생성한 숫자를 저장할 변수
		int i, k;
		boolean isDuplicated; //배열에 중복된 값 있는지 확인
		// 컴퓨터가 랜덤으로 중복되지 않게 3수를 생성
		// 배열에 3개 저장될때 까지 반복 
		
		//숫자가 차례대로 증가 하지않을경우 while사용 
		while(cnt < 3) {
			//min~max사이에 램덤한 숫자를 생성 ↓
			r = (int)(Math.random()* (max - min +1)+ min); 
			isDuplicated = false; // 초기화 작업 해야함 
			// 램덤한 숫자와 배열에 0번부터 cnt개 비교해서 중복여부를 확인
			for(i = 0 ; i < cnt ; i+=1) {
				// 중복체크 하여 중복되면 중복됐다고 저장 
				//램덤한 숫자와 배열의 i번지의 값이 같으면 isDuplicated를 true로 
				if(r == com[i]) { 
					isDuplicated = true;
				}
			}
			
			//중복되지 않으면 배열에 저장 후 저장한 갯수(cnt)를 1개를 증가
			if(!isDuplicated) {
				com[cnt] = r;
				cnt += 1;
				
			}
		}
		
		// 컴퓨터가 생성한 숫자를 출력(테스트용) 나중에 지우기 알파버전 
		for(i = 0; i<cnt; i+=1) {
			System.out.print(com[i]+" ");
		}
			System.out.println();
			Scanner scan = new Scanner(System.in);
			
		// 게임을 시작 해서 3스트라이크가 나올때 까지 반복 
		do {
			// 1. 사용자가 3수 입력 (중복되지 않는다고 가정)
			System.out.print("입력하세요");
			// 2.  볼과 스트라이크 갯수를 셈
			for(i = 0; i<3; i+=1) {
				user[i] = scan.nextInt();
			}
			// 3.  볼과 스트라이크와 아웃을 판별하여 출력
			System.out.println("");
			
		}while(strike != 3); 
		

		
		while(cnt < 3) {
			r = (int)(Math.random()*(max-min+1) + min);//랜덤으로 숫자 생성
			//배열 com에 저장된 cnt개의 숫자들 중에서 r과 중복된 숫자가 있는지 체크
			isDuplicated = false;
			for(i = 0; i<cnt; i+=1) {
				if(com[i] == r) {
					isDuplicated = true;
				}
			}
			//중복된 숫자가 없으면 배열에 r을 추가 후 cnt를 1개 증가
			if(!isDuplicated) {
				com[cnt] = r;
				cnt += 1;
			}
		}

		//테스트용 : 컴퓨터가 생성한 숫자를 확인하는 용도로 게임 플레이시 해당 코드 주석처리
		for(i = 0; i<com.length; i+=1) {
			System.out.print(com[i] + " ");
		}
	


		//3S일때까지 반복
		do {
			//사용자 숫자 입력 : 입력 시 중복된 숫자 입력하지 않을 거라고 가정
			System.out.print("입력하세요 : ");
			for(i = 0; i<user.length; i+=1) {
				user[i] = scan.nextInt();
			}

			//두 배열에서 같은 숫자가 있는지 확인하는데 같은 숫자의 갯수를 ball에 저장
			//이 때 찾은 같은 숫자의 갯수는 실제 ball의 갯수가 아니라 ball과 strike 갯수의 합
			ball = 0;
			for(i = 0; i<com.length; i+=1) {
				for(k=0; k<user.length; k+=1) {
					if(i == k) {
						continue;
					} 
					if(com[i] ==user[k]) {
						ball+=1;
					}
				}
			}
			//strike 갯수 확인
			ball = 0;
			strike = 0;
			//com배열과 user배열에서 같은 번지를 비교 하여 같은 숫자가 있으면 
			//strike를 증가
			
			for(i = 0; i<com.length; i+=1) {
				if(com[i] == user[i]) {
					strike +=1;
				}
			}
			//com배열과 user배에서 다른번지를 비교하여 같은 숫자가 있으면 
			//ball증가
			//com[0]과 user[1], user[2]와 비교,
			//com[1]과 user[0], user[2]를 비교,
			//com[2]과 user[0], user[1]를 비교
			
			//ball 갯수 확인 : 같은 수의 갯수 - strike의 갯수
			ball = ball - strike;

			//결과 출력
			if(strike != 0) { 
				System.out.print(strike+"S"); // 볼과 스트라이크와 아웃을 판별하는 출력
			}								  // 스트라이크는 0스트라이크가 아닐때 ?S를 출력
			if(ball != 0) {
				System.out.print(ball+"B");
			} //볼이 0이고 스트라이크 0이면 0출력
			if(ball == 0 && strike == 0) {
				System.out.print("O");
			}
			System.out.println();
		}while(strike != 3);
		System.out.println("정답입니다.");
		scan.close();
	}

}