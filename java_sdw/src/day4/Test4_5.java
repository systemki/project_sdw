package day4;

import java.util.Scanner;

public class Test4_5 {

	
	/* 정수를 램덤으로 생성하여 생성된 숫자를 맟추는 게임
	 * 예시 : (랜덤하게 생선된 숫자가 25인 경우)
	 * 정수가 램덤으로 생성되었습니다. 게임 시작!
	 * 정수를 입력하세요 1~100 : 100
	 * down 
	 * 정수를 입력하세요 1~100 : 40
	 * down 
	 * 정수를 입력하세요 1~100 : 10
	 * up
	 * 정수를 입력하세요 1~100 : 20
	 * up
	 * 정수를 입력하세요 1~100 : 25
	 * 정답입니다.
	 * 반복횟수 : X
	 * 규칙성  : 정수를 입력하세요라는 문자열 출력
	 * 			콘솔에서 정수를 입력 받음
	 * 			입력 받은 정수가 램덤한 수가 크면 down 이라고 출력하고
	 * 			작은면 up이라고 출력하고 
	 * 			같으면  정답 입니다. 출력후 종료 
	 */
	
	
		// 명령문 위치에 마다 다른곳에 입력시 값출력 제대로 표시 안됨 꼭 갈호 안에 확인후 입력 
	
	
	public static void main(String[] args) {
		int min = 1, max =100, num, r;  
		r = (int)(Math.random() * (max - min + 1) +min); //램덤 명령어 변수 r이랑 대입
		Scanner scan = new Scanner(System.in);
		
		for(; ; ) { 	// 반복횟수 : X 없으면 반복성에 내용을 적지 않아도 됨 (반복문 시작)
			System.out.println("정수를 입력하세요 " +   min + " ~ " + max ); // (규칙성 시작 부분 for밑 부터 규칙성으로 if )

			num = scan.nextInt();  // 콘솔에서 정수를 입력 받음 
			if(num > r ){	 //입력 받은 정수가 램덤한 수가 크면  rum:현재 입력한 숫자 , r : 램덤으로 설정된 값 
			System.out.println("down"); // down 이라고 출력하고
			}
			if(num < r ){  // rum:현재 입력한 숫자 , r : 램덤으로 설정된 값 
			System.out.println("up"); // up 이라고 출력하고
			}
			if(num == r ){ // rum:현재 입력한 숫자 , r : 램덤으로 설정된 값 
			System.out.println("정답임"); //  // 같은경우 정답이라고 출력하고
			break;  // 반복문을 중단하기 위해 break; 사용 
			} 
			
		}
		scan.close();  // 입력문 클로즈 명령어 
		
	}

}
